package com.group5.database;

import com.group5.model.User;
import com.group5.proto.User.GetUserByIdRequest;
import com.group5.proto.User.UserResponse;
import com.group5.proto.User.UserServiceGrpc;
import io.grpc.StatusRuntimeException;

public class DBUser {
    public User getUserById(long id){

        UserServiceGrpc.UserServiceBlockingStub stub = DatabaseServerConnection.getStub();
        UserResponse response = null;
        try{
            response = stub.getUserById(GetUserByIdRequest.newBuilder()
                    .setUserId(id).build());
        } catch (StatusRuntimeException e) {
            System.out.println("User not found");
            e.printStackTrace();
        }

        return new User(id, response.getName(), response.getSurname(), response.getEmail());

    }
}
