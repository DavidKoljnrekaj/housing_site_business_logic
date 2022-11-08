package com.group5.database;

import com.group5.GetUserByIdRequest;
import com.group5.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class  DatabaseServerConnection {


    public static UserServiceGrpc.UserServiceBlockingStub getStub(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8081").usePlaintext().build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);

        return blockingStub;
    }
}

