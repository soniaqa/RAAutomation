package NewRestAssuredDemo;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


//import static org.hamcrest.Matcher.*;

public class RestBasic1 {
	@Test
	public void test1()
	{
		given()
		
		.get("https://reqres.in/api/users?page=2")
		
		.then()

		.statusCode(200)
		
		.log().all();
	}
	
	
}