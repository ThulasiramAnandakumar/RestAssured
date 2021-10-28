package Task_Sep24_EditPosts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_New_Data 
{
	@Test
	void Post()
	{
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request=RestAssured.given();
		
		JSONObject json=new JSONObject();
		json.put("user_id", 23);
		json.put("title", "Selena_Gomez");
		json.put("body", "Selena Marie Gomez is an American singer and actress. Born and raised in Texas, Gomez began her acting career on the children's television series Barney & Friends. In her teenage years, she rose to prominence for her role as Alex Russo in the Disney Channel television series Wizards of Waverly Place.");
		

		request.header("Content-Type","application/json");
		request.body(json.toJSONString());
		
		Response response=request.post("/public/v1/?access-token=51e45659b17436f2804dee7db56facf715d7843757726c610225da60694f3162");
		
		System.out.println(response.getBody().asPrettyString());

		int statusCode=response.statusCode();
		System.out.println(statusCode);
		
	}

}
