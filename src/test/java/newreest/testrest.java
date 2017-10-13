package newreest;


import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;




public class testrest {
	@Test
    public void makeSureThatGoogle() {
        given().when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().statusCode(200).log().all();
}
}