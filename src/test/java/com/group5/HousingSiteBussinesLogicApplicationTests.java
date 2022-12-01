package com.group5;

import com.group5.database.DBUser;
import com.group5.service.BusinessLogicService;
import com.group5.service.BusinessLogicServiceImpl;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HousingSiteBussinesLogicApplicationTests {

	@Test
	void contextLoads() {
		DBUser dbUser = new DBUser();
		System.out.println(dbUser.getUserById(1).getEmail());
	}

	@Test
	void creatingListing(){
		BusinessLogicService service = new BusinessLogicServiceImpl();

		List<String> image64DataList = new ArrayList<>();
		image64DataList.add("image");

		List<String> imageContentTypeList = new ArrayList<>();
		imageContentTypeList.add("png");

		List<String> imageFileNameList = new ArrayList<>();
		imageFileNameList.add("picture");

		System.out.println(service.createHouseListing("Kollegievet", 8700, "Horsens", 30, 1990, 2020,
				true, 120, 120, image64DataList, imageContentTypeList, imageFileNameList, 200000));
	}
}