package com.group5.service.implementations;

import com.group5.database.DatabaseServerConn;
import com.group5.model.User;
import com.group5.proto.User.*;
import com.group5.service.services.UserService;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

        return new User(response.getEmail(), response.getName(), response.getSurname());

    }


    public Optional<User> createUser(String email, String name, String surname, String password) {
        CreateUserResponse response = blockingStub.createUser(CreateUserRequest.newBuilder().setEmail(email).setName(name).setSurname(surname).setPassword(password).build());

        User user = new User(response.getEmail(), response.getName(), response.getSurname());

        return Optional.of(user);
    }


}
