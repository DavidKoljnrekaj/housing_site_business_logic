package com.group5;

import com.group5.database.DBUser;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousingSiteBussinesLogicApplicationTests {

	@Test
	void contextLoads() {
		DBUser dbUser = new DBUser();
		System.out.println(dbUser.getUserById(1).getEmail());
	}
}