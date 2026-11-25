package org.testorbit.engine.model.request;

import java.util.Map;

public class ApiRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body ;

    public ApiRequest(String url, String method, Map<String, String> headers, String body){
        this.url = url;
        this.method = method;
        this.headers = headers ;
        this.body = body ;
    }



    public String getUrl(){
        return url ;
    }

    public String getMethod(){
        return method ;
    }

    public Map<String, String> getHeaders(){
        return headers;
    }

    public String getBody(){
      return body ;
    }

}
