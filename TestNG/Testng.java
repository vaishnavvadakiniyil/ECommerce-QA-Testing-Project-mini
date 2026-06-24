
package com.etp;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Testng {

    @Test(priority = 1, description = "Get Product By ID")
    public void getProduct() {

        given()

        .when()
            .get("http://localhost:3000/products/1")

        .then()
            .statusCode(200)
            .body("id", equalTo("1"))
            .body("name", notNullValue());

        Assert.assertTrue(true);

        System.out.println("GET Product Passed");
    }

    @Test(priority = 2, description = "Get All Products")
    public void getAllProducts() {

        given()

        .when()
            .get("http://localhost:3000/products")

        .then()
            .statusCode(200);

        Assert.assertTrue(true);

        System.out.println("GET All Products Passed");
    }

    @Test(priority = 3, description = "Create Product")
    public void createProduct() {

        String payload = """
        {
            "name":"Gaming Keyboard",
            "category":"Electronics",
            "price":1500,
            "stock":20
        }
        """;

        given()
            .header("Content-Type","application/json")
            .body(payload)

        .when()
            .post("http://localhost:3000/products")

        .then()
            .statusCode(201)
            .body("name", equalTo("Gaming Keyboard"));

        Assert.assertEquals(201, 201);

        System.out.println("POST Product Passed");
    }
}