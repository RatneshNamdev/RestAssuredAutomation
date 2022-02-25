import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;
import org.codehaus.groovy.ast.stmt.TryCatchStatement;
import org.json.simple.JSONObject;

import static org.hamcrest.MatcherAssert.*;

import static io.restassured.RestAssured.*;

public class HamcrestExample3Test {
	
//	@Test
	public void textAssertion() {
		
		baseURI="https://reqres.in/api/users?page=2/";
		//basePath="/users";
		
//		Response response=given().contentType(ContentType.JSON).get("/7").then().assertThat().body("first_name", equalTo("Michael")); 
	
		Response response= given()
				.contentType(ContentType.JSON)
				.get("/7");
		
//		JsonPath jsonPathEvalutor = response.jsonPath();
		
		response.then().assertThat().body("data.first_name", is("Michael"));
		response.then().assertThat().body("data.first_name", is(equalTo("Michael")));
		response.then().assertThat().body("data.first_name", equalTo("Michael"));
		
		
//		assertThat(response.then().body("data.email", equalTo("michael.lawson@reqres.in")));
		
		
		
//		Response response1= given().contentType(ContentType.JSON).get("https://reqres.in/api/users?page=2/");
//		
//		System.out.println("body of data : "+ response.asString() + "\n" + "Status code: "+ response.statusCode());
//		
//		System.out.println("main object data : "+ given().get("https://reqres.in/api/users?page=2/").asString());
//		
//		System.out.println("Json data: "+ response1.asString());
//		JsonPath extractData = response.jsonPath();
//		
//		JsonPath objectData=response1.jsonPath();
//		
//		System.out.println("total_pages : "+ objectData.get("total_pages"));
//		
//		System.out.println("first_name => "+ extractData.get("data.first_name"));
//		System.out.println("email => "+ extractData.get("data.email"));
//		
//		System.out.println("assertThatData => "+ response.then().assertThat().body("data.first_name", equalTo("Michael")));
//		System.out.println("assertThatData => "+ given().get("https://reqres.in/api/users?page=2/").then().assertThat().body("total_pages", equalTo(2)));
//		System.out.println("assertThatData => "+ response.then().assertThat().body("data.first_name", is("Michael")));
//		System.out.println("assertThatData => "+ response.then().assertThat().body("data.first_name", is(equalTo(("Michael")))));
//		System.out.println("assertThatData => "+ response.then().assertThat().body("data.first_name", is(equalTo(("Michael")))));
	}

	@Test
	public void TestGoodExample() {
		baseURI="https://reqres.in/api/users?page=2/";
						
		Response response= given()
				.contentType(ContentType.JSON)
				.get("/7");
		assertThat(response.getStatusCode(), is(HttpStatus.SC_OK));
//		JSONObject request=new JSONObject();
		JsonPath jsonObj= response.jsonPath();
		
		assertThat(jsonObj.get("data.email"), is("michael.lawson@reqres.in"));
		assertThat(jsonObj.get("data.first_name"), is("Michael"));
		assertThat(jsonObj.get("data.last_name"), is(equalTo("Lawson")));
//		assertThat(jsonObj.getInt("total_pages"), is(2));
		
		
		
		
	}

}















