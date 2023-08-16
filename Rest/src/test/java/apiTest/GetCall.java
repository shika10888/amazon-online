package apiTest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class GetCall {
	int id=417;
@Test
	public void getcall() {
	
      given()
      
      
      
      .when().get("https://reqres.in/api/users?page=2")
      
      
      
      
      .then().statusCode(200).log().all();
}
@Test
     public void postcall() {
	
	HashMap payload=new HashMap();
	payload.put("name", "Roicians");
	payload.put("Job", "QA");
	
	
      given().contentType("application/json").body(payload)
      
      
      
      .when().post("https://reqres.in/api/users")
      
      
      
      
      .then().statusCode(201).log().all();

}

@Test
   public void putcall() {
	
HashMap payload=new HashMap();
payload.put("name", "Roicians");
payload.put("Job", "Developer");

given().contentType("application/json").body(payload)
.when().put("https://reqres.in/api/users/"+id)

.then().statusCode(200).log().all();

}
@Test
public void deletecall() {
given()
.when().delete("https://reqres.in/api/users/2")
		.then().statusCode(204).log().all();	
}

}



