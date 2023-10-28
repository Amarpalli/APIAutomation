package api.endpoints;

import static io.restassured.RestAssured.given;

import api.Payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class userEndPoints {

	
	public static Response createUser(User payload)
	{
		Response response = given()//url endpoints are given
		.accept(ContentType.JSON) //type of the content given
		.contentType(ContentType.JSON)
		.body(payload)
		
		
		.when() // action. When user post the request then return the response
		.post(Routes.post_url); // creating new user using post api action
		
		return response;
	}
	
	
	public static Response GetUser(String userName)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("username", userName)
		
		.when()
		.get(Routes.get_url);
		
		return response;
	}
	
	
	public static Response UpdateUser(String userName, User payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.pathParam("username", userName)
		.body(payload)
		
		
		.when()
		.put(Routes.put_url);
		
		return response;
	}
	
	
	public static Response DeleteUser(String userName)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("username", userName)
			
		
		.when()
		.delete(Routes.delete_url);
		
		return response;
	}
	
}