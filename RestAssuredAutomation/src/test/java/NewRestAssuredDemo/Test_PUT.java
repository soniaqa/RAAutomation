package NewRestAssuredDemo;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test_PUT {
	@Test
	public void put()
	{
		given()
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}

}
