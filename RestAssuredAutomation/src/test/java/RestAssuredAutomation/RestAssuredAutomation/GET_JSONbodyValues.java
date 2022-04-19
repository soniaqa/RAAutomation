package RestAssuredAutomation.RestAssuredAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_JSONbodyValues {
	@Test
	public void jsonbody() {
		// Base URI
		RestAssured.baseURI = "https://weatherdbi.herokuapp.com/data/weather/New York";

		// Request Object
		RequestSpecification httprequest = RestAssured.given();

		// Response Object
		Response response = httprequest.request(Method.GET, "/London");

		JsonPath jsonpath = response.jsonPath();

		System.out.println(jsonpath.get("Region"));
		System.out.println(jsonpath.get("Dayhour"));
		System.out.println(jsonpath.get("precip"));
		System.out.println(jsonpath.get("humidity"));
		System.out.println(jsonpath.get("iconURL"));
		System.out.println(jsonpath.get("comment"));

	}

}

