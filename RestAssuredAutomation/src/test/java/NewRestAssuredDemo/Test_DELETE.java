package NewRestAssuredDemo;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test_DELETE {
	@Test
	public void delete()
	{
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
		
	}

}
