 import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExample1 {

	@DataProvider(name= "DataForPost")
	public Object[][] dataForPost(){
		
//		Object[][] data=new Object[2][3];
//		
//		data[0][0]="Albert";
//		data[0][1]="Einstein";
//		data[0][2]=2;
//		
//		data[1][0]="Thomas";
//		data[1][1]="Edison";
//		data[1][2]=1;
//		
//		return data;
		
		return new Object[][] {
			{"Graham", "Bell", 1},
			{"Henry", "ford", 2}
		};
	} 
	
	
	@Test(dataProvider = "DataForPost")
	public void test_post(String firstName, String lastName, int subjectId) {
		
		JSONObject request=new JSONObject();
//		Response response= get("http://localhost:3000/");
//		
//		
//	System.out.println();	response.firstName
		
//		request.put("firstName", firstName);
//		request.put("o", lastName);
//		request.put("subjectId",subjectId);
		
		baseURI = "http://localhost:3000/";
		
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.header("Content-Type", "application/json")
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.log().all();
	}
	
//	@DataProvider(name="deleteData")
//	public Object[] dataForDelete() {
//		return new Object[] {
//			4,5,6,7
//		};
//	}
//	
//	@Test(dataProvider = "deleteData")
	public void test_delete(int userId) {
		
		baseURI = "http://localhost:3000/";
		
		when()
			.delete("/users/"+userId)
		.then()
			.statusCode(200)
			.log().all();
	}
}
