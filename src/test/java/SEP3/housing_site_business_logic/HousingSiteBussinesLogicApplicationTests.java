package SEP3.housing_site_business_logic;

import SEP3.housing_site_business_logic.database.DBUser;
import SEP3.housing_site_business_logic.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousingSiteBussinesLogicApplicationTests {

	@Test
	void contextLoads() {
		DBUser dbUser = new DBUser();

		long id = 1;

		User user = dbUser.getUserById(id);

		System.out.println(user.getId());
	}

}
