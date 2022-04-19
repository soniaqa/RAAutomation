package RestAssuredAutomation.RestAssuredAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ResponseBody {
	@Test
	public void responsebody() {

		// Base URI
		RestAssured.baseURI = "https://weatherdbi.herokuapp.com/data/weather";

		// Request Object
		RequestSpecification httprequest = RestAssured.given();

		// Response Object
		Response response = httprequest.request(Method.GET, "/New York");

		// Print Response
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" + responseBody);

		Assert.assertEquals(responseBody.contains("New York"), true);
			
		
	}

}
