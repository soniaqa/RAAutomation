package RestAssuredAutomation.RestAssuredAutomation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request {
	@Test
	public void customerregister() {
		
		//Base URI
		RestAssured.baseURI="http://xxxx.backendless.app/api/users/";
		//RestAssured.baseURI="http://restapi.demoqa.com/customer";
		
		//Request Object
		RequestSpecification httprequest=RestAssured.given();
		
		//Json Object
		JSONObject requestParams=new JSONObject();
		

		requestParams.put("FirstName", "Abc");
		requestParams.put("LastName", "abc");
		requestParams.put("UserName", "Abcabc");
		requestParams.put("Password", "ertxyz");
		requestParams.put("Email", "Abcabcxyz.com");
		
		httprequest.header("Content-Type","application/json");
		
		//Attach Above data to request
		httprequest.body(requestParams.toJSONString());
		
		// Response Object
		Response response=httprequest.request(Method.POST,"/register");
		
		//Print Response
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is" +response);
		
		//Success code Validation
		int statuscode=response.getStatusCode();
		System.out.println("Statuscode is" +" statuscode");
		
		// Success Code Validation
		String successcode=response.jsonPath().get("Successcode");
		System.out.println("Success code is" +" successcode");
		
		//https://resttesttest.com/
		//https://reqres.in/
		/*https://restful-booker.herokuapp.com/apidoc/index.html

			https://gorest.co.in

			http://httpbin.org/#/

			https://calendarific.com/api-documentation

			https://pokeapi.co/
			
			http://dummy.restapiexample.com/api/v1/employees

			https://reqbin.com/*/


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
