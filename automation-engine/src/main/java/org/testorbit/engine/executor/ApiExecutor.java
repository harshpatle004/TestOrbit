package org.testorbit.engine.executor;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testorbit.engine.model.request.ApiRequest;

public class ApiExecutor {

    public Response executeGet(ApiRequest request) {

        RequestSpecification specification =
                RestAssured.given();

        specification.header(
                "Content-Type", "application/json"
        );

        Response response = specification
                .when()
                .get(request.getUrl());

        return response;
    }
}