package SEP3.housing_site_business_logic.database;

import SEP3.housing_site_business_logic.GetUserByIdRequest;
import SEP3.housing_site_business_logic.GetUserByIdResponse;
import SEP3.housing_site_business_logic.UserServiceGrpc;
import SEP3.housing_site_business_logic.model.User;

public class DBUser {

    public User getUserById(long id){
        UserServiceGrpc.UserServiceBlockingStub stub = DatabaseServerConnection.getStub();

        System.out.println(stub.toString());

        System.out.println(GetUserByIdRequest.newBuilder().setUserId(id).build());
        GetUserByIdResponse response = stub.getUserById(GetUserByIdRequest.newBuilder().setUserId(id).build());

        return new User(response.getId(), response.getName(), response.getSurname(), response.getEmail());
    }
}
