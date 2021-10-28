package Task_Sep24;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_User 
{
	@Test
	void  Delete()
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		
		Response response =request.delete("/public/v1/users/1606");
		
		System.out.println(response.statusCode());
		
	}
	

}
