import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Post {

//	@Test
	public void test_post01() {
		
//		Map<String, Object> map=new HashMap<String, Object>();
//		
//		map.put("name", "Jitendra");
//		map.put("job", "Developer");
//		
//		System.out.println(map);
//		
		JSONObject request=new JSONObject();
		request.put("name", "Ram");
		request.put("desn", "Software Tester");
		
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
	}
	
//	@Test
	public void test_put01() {
		
//		Map<String, Object> map=new HashMap<String, Object>();
//		
//		map.put("name", "Jitendra");
//		map.put("job", "Developer");
//		
//		System.out.println(map);
//		
		JSONObject request=new JSONObject();
		request.put("name", "Ram");
		request.put("desn", "Software Tester");
		
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();
	}
//	@Test
	public void test_patch01() {
		
//		Map<String, Object> map=new HashMap<String, Object>();
//		
//		map.put("name", "Jitendra");
//		map.put("job", "Developer");
//		
//		System.out.println(map);
//		
		JSONObject request=new JSONObject();
		request.put("name", "Ram");
		request.put("desn", "Software Tester");
		
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();
	}
	
//	@Test
	public void test_delete01() {
		
	
		when()
			.delete("https://reqres.in/api/users/2").then()
			.statusCode(204)
			.log().all();
	}
	
}
