package DataDrivenTest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CreateEmployeeList {
	@SuppressWarnings("unchecked")
	@Test
	public void employeelist() {
		// Base URI
		RestAssured.baseURI = "http://reqres.in/api/users";
		// Request Object
		RequestSpecification httprequest = RestAssured.given();

		// Create Parameters
		JSONObject requestParams = new JSONObject();
		//JsonPath.parse(requestParams).set("name", "TEJAVXYZ");
		requestParams.put("name", "TEJAVXYZ");
		requestParams.put("salary", "8000");
		requestParams.put("age", "30");

		httprequest.header("Content-Type", "application/Json");

		httprequest.body(requestParams.toJSONString());
		System.out.println(requestParams.toJSONString());
		// Response Object
		Response response = httprequest.post("/create");
		System.out.println("The status received: " + response.statusLine());

		// Print Response
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("TEJAVXYZ"), true);
		Assert.assertEquals(responseBody.contains("8000"), true);
		Assert.assertEquals(responseBody.contains("30"), true);
		
		int statusCode= response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		

	}

}
