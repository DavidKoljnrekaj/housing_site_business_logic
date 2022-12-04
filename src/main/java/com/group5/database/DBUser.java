package com.group5.database;

import com.group5.proto.User.GetUserByIdRequest;
import com.group5.proto.User.GetUserByIdResponse;
import com.group5.proto.User.UserServiceGrpc;
import com.group5.model.User;
import io.grpc.StatusRuntimeException;

public class DBUser {
    public User getUserById(long id){

        UserServiceGrpc.UserServiceBlockingStub stub = DatabaseServerConnection.getStub();
        GetUserByIdResponse response = null;
        try{
            response = stub.getUserById(GetUserByIdRequest.newBuilder()
                    .setUserId(id).build());
        } catch (StatusRuntimeException e) {
            System.out.println("User not found");
            e.printStackTrace();
        }

        return new User(response.getEmail(), response.getName(), response.getSurname());

    }
}
