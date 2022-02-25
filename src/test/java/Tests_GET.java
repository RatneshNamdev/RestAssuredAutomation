
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_GET{
	
	
//	@Test
//	public void getObjectBody()
//	{
//		//https://restapi.demoqa.com/utilities/weather/city
//		RestAssured.baseURI = "https://reqres.in/api/users?page=2/";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response response = httpRequest.get("/Michael");
//
//		// Retrieve the body of the Response
//		ResponseBody body = response.getBody();
//
//		// By using the ResponseBody.asString() method, we can convert the  body
//		// into the string representation.
//		System.out.println("Response Body is: " + body.asString());
//	}
//	
	
	@Test
	public void test_01() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[1]", equalTo(8))
			.body("data.first_name", hasItems("Michael", "Lindsay"))
			.log().all();
		
//		Response response= given().get("/8");
//		String email= given().get("/8").then().extract().path("email");
//		System.out.println(email);
	}
	
	@Test
	public void test_02() {
		
		System.out.println("Hello heros...");
	}
}