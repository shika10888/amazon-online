package apiTest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Auth {
	
	@Test
public void basicauth() {
		given().auth().basic("postman", "password")
	
		.when().get("https://postman-echo.com/basic-auth")
		
		
		
		
		.then().statusCode(200).log().all();

}
	@Test
	public void digestauth() {
	given().auth().digest("admin", "admin")
	.when().get("https://postman-echo.com/basic-auth")
	.then().log().all();
	}
	@Test
	public void bearertoken() {
		String Token="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";
		given().headers("Authorization", "Bearer "+Token)
		.when().get("https://api.github.com/user/repos")
		.then().statusCode(200).log().all();
		
		
	}
}
