package RestAssuredAutomation.RestAssuredAutomation;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request {
	@Test
	public void weatherconditions() {
		
		//Basic URI
		//RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RestAssured.baseURI="https://weatherdbi.herokuapp.com/data/weather";
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
		
		//Response Object
		Response response=httprequest.request(Method.GET,"/newyork" );
		
		//print Response
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		//Status Code Validation
		int statusCode=response.getStatusCode();
		System.out.println("Status Code is" +statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		//Status line Validation
		String statusline=response.getStatusLine();
		System.out.println("Status line is"  +statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
