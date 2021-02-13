package com.testsingh.http;

import com.github.sitture.env.config.EnvConfig;
import kong.unirest.HttpResponse;

import java.util.Map;

public class RestfulBookerRequests extends Requests {

    public RestfulBookerRequests() {
        super(EnvConfig.get("HOST"));
    }

    public HttpResponse getBooking(String path, Map<String, String> headers, String id) {
        return getRequest(path + id, headers);
    }

}
