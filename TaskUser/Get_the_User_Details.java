package Task_Sep24;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get_the_User_Details
{
	@Test
	void Get()
	{
		String token="51e45659b17436f2804dee7db56facf715d7843757726c610225da60694f3162";
		
		RestAssured.baseURI="https://gorest.co.in";
		
			
		RestAssured
		.given()
			.auth()
			.oauth2(token)
			.contentType(ContentType.JSON)
		.when()
			.get("/public/v1/users/1623")
		.then()
			.statusCode(200)
		.extract()
		.response()
		.prettyPrint();
		
	}
}
