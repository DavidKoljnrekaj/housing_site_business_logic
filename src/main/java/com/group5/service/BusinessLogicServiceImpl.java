package com.group5.service;

import com.group5.GetUserByIdRequest;
import com.group5.GetUserByIdResponse;
import com.group5.UserServiceGrpc;
import com.group5.database.DatabaseServerConnection;
import com.group5.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    private UserServiceGrpc.UserServiceBlockingStub stub;

    public BusinessLogicServiceImpl()
    {
        stub=DatabaseServerConnection.getStub();
        //database=new DatabaseServerConnection();
    }
    public Optional<User> findUserById(Long id)
    {
        GetUserByIdResponse response=stub.getUserById(GetUserByIdRequest.newBuilder()
                        .setUserId(id)
                .build());
        User user = new User(id, response.getName(), response.getSurname(),response.getEmail());
        Optional<User>user1=Optional.of(user);
        return user1;
    }
}
