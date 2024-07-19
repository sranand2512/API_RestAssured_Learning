package com.saurabhRestAssured.ex_22_july_2024.Crud.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class L275 {


    RequestSpecification rs = RestAssured.given();
    Response res ;
    ValidatableResponse vr;
    String token = "87c7dbe0b903344";
    String BookingId = "/20";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";


    @Test
    public void testDeleteRequestNonBDD(){
        String BASE_PATH_up = BASE_PATH + BookingId;
        System.out.println(BASE_PATH_up);



        rs.baseUri(BASE_URL);
        rs.basePath(BASE_PATH_up);
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.log().all();

        res = rs.when().log().all().patch();

        vr = res.then().log().all();
        vr.statusCode(200);





    }
}
