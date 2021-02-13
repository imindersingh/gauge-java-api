package com.testsingh.steps;

import com.testsingh.http.RestfulBookerRequests;
import com.thoughtworks.gauge.Step;
import kong.unirest.HttpResponse;

import java.io.IOException;
import java.util.HashMap;

public class Login {

    @Step("Get booking with id <id>")
    public void getBookingWithId(final String id) throws IOException {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        String path = "/booking/";
                
        RestfulBookerRequests request = new RestfulBookerRequests();
        HttpResponse response = request.getBooking(path, headers, id);

    }

    @Step("Then the response will be 200")
    public void assertHttpResponseCode() {
        //assert against response - make response static
    }
}
