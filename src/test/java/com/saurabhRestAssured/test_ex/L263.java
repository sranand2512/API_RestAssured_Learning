package com.saurabhRestAssured.test_ex;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class L263 {

    @Test
    @Description
    public void getrequest() {

        // Rest assured Hello world program

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")

                .when()
                .get().

                then()
                .statusCode(201);

    }
}
