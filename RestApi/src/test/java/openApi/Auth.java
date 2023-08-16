package openApi;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Auth {
	//BAsic Auth
	@Test
	public void BasicAuth() {
		given().auth().basic("postman", "password")		
		
		
		.when().get("https://postman-echo.com/basic-auth")
		
		
		.then().statusCode(200).log().all();
	}
	
	
	
//Bearer Token
	@Test
	public void BearerToken() {
		
		String Token="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";
		
		given().headers("Authorization","Bearer" +Token)
		
		
		.when().get("https://docs.github.com/en/rest/reference/repos")
		.then().statusCode(200).log().all();
	}
	
	
}
