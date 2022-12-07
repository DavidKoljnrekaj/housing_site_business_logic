package com.group5;


import com.group5.model.User;
import com.group5.security.JwtTokenUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousingSiteBussinesLogicApplicationTests {
	/*

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

	 */

    @Test
    void stringToByte(){
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();

        User user = new User("kasdhja ksd", "", "");

        String token = jwtTokenUtil.generateToken(user);

        boolean validated = jwtTokenUtil.validateToken(token, user);

        String email = jwtTokenUtil.getUsernameFromToken(token);


        System.out.println(token);
        System.out.println(validated);
        System.out.println(email);
    }
}