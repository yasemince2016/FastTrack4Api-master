package FastTrack4Api;

import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;

import java.awt.image.*;
import java.util.*;

import static io.restassured.RestAssured.given;

public class Deserilization extends TestBase{

    @Test
    public void test1(){

        Response response = given().accept(ContentType.JSON)
                .when().get("/api/spartans/20");

        Map<String, Object> spartan20 = response.as(Map.class);

    }
}
