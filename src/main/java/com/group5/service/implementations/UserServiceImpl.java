package com.group5.service.implementations;

import com.group5.database.DatabaseServerConn;
import com.group5.model.User;
import com.group5.proto.User.GetUserByIdRequest;
import com.group5.proto.User.UserResponse;
import com.group5.proto.User.UserServiceGrpc;
import com.group5.service.services.UserService;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserServiceGrpc.UserServiceBlockingStub blockingStub;
    UserServiceGrpc.UserServiceStub stub;

    public UserServiceImpl()
    {
        blockingStub= DatabaseServerConn.getUserBlockingStub();
        stub=DatabaseServerConn.getUserStub();
    }

    public User getUserById(long id){

        UserResponse response = null;
        try{
            response = blockingStub.getUserById(GetUserByIdRequest.newBuilder()
                    .setUserId(id).build());
        } catch (StatusRuntimeException e) {
            System.out.println("User not found");
            e.printStackTrace();
        }

        return new User(id, response.getName(), response.getSurname(), response.getEmail());

    }
}
