package executor;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testorbit.engine.executor.ApiExecutor;
import org.testorbit.engine.model.request.ApiRequest;
import org.testorbit.engine.model.response.ApiResponse;

import java.util.HashMap;

public class ApiTestExecutor {

    @Test
    public void testGetRequest() {

        ApiRequest request = new ApiRequest(
                "https://jsonplaceholder.typicode.com/users/1",
                "GET",
                new HashMap<>(),
                null
        );


        ApiExecutor executor = new ApiExecutor();

        ApiResponse response = executor.execute(request);

        Assert.assertEquals(response.getStatusCode(), 200);

        Assert.assertFalse(response.getResponseBody().isEmpty());

        Assert.assertTrue(response.getResponseTime() > 0);

        System.out.println(response.getResponseBody());
        System.out.println(response.getResponseTime());
    }
}