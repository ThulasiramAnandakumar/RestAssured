package Task_Sep24_Comments;

import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Comments
{
	@Test
	void GetComments()
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request =	RestAssured.given();
		Response response=request.get("/public/v1/posts/123/comments/?id=1437/?access-token=51e45659b17436f2804dee7db56facf715d7843757726c610225da60694f3162");	
		System.out.println(response.statusCode());

		JsonPath jpath=response.getBody().jsonPath();
		
		response.getBody().prettyPrint();
		
		System.out.println("Name : "+jpath.get("name"));
	}

}
