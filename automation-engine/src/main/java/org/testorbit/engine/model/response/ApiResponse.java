package org.testorbit.engine.model.response;

public class ApiResponse {

    private final int statusCode;
    private final String responseBody;
    private final long responseTime;

    public ApiResponse(int statusCode, String responseBody, long responseTime){

        this.statusCode = statusCode;
        this.responseBody = responseBody ;
        this.responseTime = responseTime ;
    }

    public int getStatusCode(){
        return statusCode ;
    }

    public String getResponseBody(){
        return responseBody ;
    }

    public long getResponseTime(){
        return responseTime ;
    }
}
