import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestObjectDataExtract {
	
	@Test
	public void test_get() {
		
		baseURI = "http://localhost:3000/";		
		basePath="/users";
		Response response = given().contentType(ContentType.JSON).log().all().get("/3"); 
		
		System.out.println("The Body of 3rd object is : " + response.asString() +"\n"+ "Status code : " + response.statusCode());
		
		JsonPath dataExtract= response.jsonPath();
		
		System.out.println(" ID => " + dataExtract.get("id"));
		System.out.println("FIRST - NAME => " + dataExtract.get("firstName"));
		
		/*
		 *  Response response = given().contentType(ContentType.JSON).log().all().get("/3"); 
		 *  String name= response.then().extract().path("firstName"); 
		 *  System.out.println("Response Body is: " + name);
		 */		
//		Response response=(Response) given()
//			.param("subjectName", "Automation")
//			.get("/subjects")
//		.then()
//			.statusCode(200)
//			.log().all();
	}
	
////	@Test
//	public void WeatherMessageBody()
//	{
//		RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response response = httpRequest.get("/Hyderabad");
//
//		// Retrieve the body of the Response
//		ResponseBody body = response.getBody();
//
//		// By using the ResponseBody.asString() method, we can convert the  body
//		// into the string representation.
//		System.out.println("Response Body is: " + body.asString());
//	}


}
