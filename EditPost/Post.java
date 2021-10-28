package Task_Sep24_EditPosts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Post 
{
	@Test
	void Post()
	{
		
		
	String token="83d63516e74776b379938a452d3bdae2a39779b3f0d35c02c3a132bdaf21e48f";
		
		
		RestAssured.baseURI="https://gorest.co.in";
		
		JSONObject json=new JSONObject();
		json.put("user_id", 23);
		json.put("title", "SelGomez");
		json.put("body", "Selena Marie Gomez is an American singer and actress. Born and raised in Texas, Gomez began her acting career on the children's television series Barney & Friends. In her teenage years, she rose to prominence for her role as Alex Russo in the Disney Channel television series Wizards of Waverly Place.");
		
		
		RestAssured
		.given()
			.auth()
			.oauth2(token)
			.contentType(ContentType.JSON)
			.body(json.toJSONString())
			.post("/public/v1/posts")
		.then()
			.statusCode(201)
		.extract()
		.response()
		.prettyPrint();
		
	}

}
