package org.testorbit.engine.executor;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testorbit.engine.model.request.ApiRequest;
import org.testorbit.engine.model.response.ApiResponse;

public class ApiExecutor {

    public ApiResponse execute(ApiRequest request) {

        RequestSpecification specification =
                RestAssured.given();

        specification.header(
                "Content-Type", "application/json"
        );

        Response response = specification
                .when()
                .get(request.getUrl());

        ApiResponse apiResponse = new ApiResponse(

                response.getStatusCode(),
                response.getBody().asString(),
                response.getTime()

        );

        return apiResponse ;
    }
}