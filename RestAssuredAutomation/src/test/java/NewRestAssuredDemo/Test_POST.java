package NewRestAssuredDemo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_POST {
	@Test
	public void post()
	
	{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name","Rithu");
		map.put("Job", "Doctor");
		
		System.out.println(map);
		
		JSONObject request=new JSONObject();
		
		request.put("name","Rithu");
		request.put("Job", "Doctor");
		
		System.out.println(request);
	
		given().
		header("content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).
		log().all();
		
	}

}
