package openApi;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Crudoperations {
	int id=799;
	
	//Get Call
@Test
public void GetCall() {
	given()
	.when().get("https://reqres.in/api/users?page=2")
	.then().statusCode(200).log().all();

}

//Post Call
@Test
public void PostCall() {
	HashMap payload=new HashMap();
	
	payload.put("name", "Shika");
	payload.put("Job", "Automation Tester");
	given().contentType("application/json").body(payload)
	.when().post("https://reqres.in/api/users")
	.then().statusCode(201).log().all();

}

//Put Call
@Test
public void PutCall() {
	
	
HashMap payload=new HashMap();
	
	payload.put("name", "Shika");
	payload.put("Job", "QA Lead");
	given().contentType("application/json").body(payload)
	.when().put("https://reqres.in/api/users/"+id)
	.then().statusCode(200).log().all();

}

//Delete Call
@Test
public void DeleteCall() {
	given()
	.when().delete("https://reqres.in/api/users/"+id)
	.then().statusCode(204).log().all();
}
	
	
	
	
	
}

