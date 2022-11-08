package SEP3.housing_site_business_logic.database;

import SEP3.housing_site_business_logic.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DatabaseServerConnection {


    public static UserServiceGrpc.UserServiceBlockingStub getStub() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        System.out.println(channel.toString());

        UserServiceGrpc.UserServiceBlockingStub stub
                = UserServiceGrpc.newBlockingStub(channel);
        return stub;
    }

    /*
    private BlockingSutb stub;

    public DatabaseServerConnection()
    {
        channel=ManagedChannelBuilder.forAddress("localhost", 8080)
        stub= .newBlockingStub(channel);
    }
    */
}
