package Task_Sep24_Comments;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Comments 
{
	@Test
	void PostComments()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		 
		RequestSpecification request=RestAssured.given();
		
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("post_id","21");
		jsonObj.put("name", "Thulasiram");
		jsonObj.put("email","thulasi21@gmail.com");
		jsonObj.put("body","Hakuna Matata");
		
		request.header("Content-Type","application/json");
		request.body(jsonObj.toJSONString());
		Response reponse=request.post("/public/v1/posts/123/comments?access-token=51e45659b17436f2804dee7db56facf715d7843757726c610225da60694f3162");
		
		System.out.println( reponse.getStatusCode());
		reponse.getBody().prettyPrint();
		
	}

}
