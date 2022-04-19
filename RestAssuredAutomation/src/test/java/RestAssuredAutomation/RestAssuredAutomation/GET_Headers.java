package RestAssuredAutomation.RestAssuredAutomation;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Headers {
	@Test
	public void headers() {
		
		//Basic URI
		RestAssured.baseURI="https://api.publicapis.org";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
		
		//Response Object
		Response response=httprequest.request(Method.GET,"/entries");
		
		//Print Response
		String responseBody=response.getBody().asString();
		System.out.println("ResponseBody is" +responseBody);
		
		/*//Header File
		String ContentType=response.getHeader("Content-Type");
		System.out.println("ContentType  " +  ContentType);
		Assert.assertEquals(ContentType, "application/json");*/
		
		//Headers File
		Headers allheaders=response.headers();
		
		for(Header header:allheaders)
		{
			System.out.println(header.getName()+" "+header.getValue());
		}
		
	}

}
