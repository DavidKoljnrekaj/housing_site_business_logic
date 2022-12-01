package com.group5.database;

import com.group5.ListingServiceGrpc;
import com.group5.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class  DatabaseServerConnection {


    public static UserServiceGrpc.UserServiceBlockingStub getStub(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);
        //PostHouseListingGrpc.PostHouseListingBlockingStub blockingStub1 = PostHouseListingGrpc.newBlockingStub(channel);

        return blockingStub;
    }

    public static ListingServiceGrpc.ListingServiceBlockingStub getStub1(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();


        ListingServiceGrpc.ListingServiceBlockingStub blockingStub = ListingServiceGrpc.newBlockingStub(channel);

        return blockingStub;
    }



}

