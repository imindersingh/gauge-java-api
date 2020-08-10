package com.imindersingh.testing.httprequests;


import okhttp3.*;

import java.io.IOException;

public class RequestHandler {

    private final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public void post(String body) throws IOException {

        Request request = new Request.Builder()
                .url("https://reqres.in/api/")
                .post(RequestBody.create(body, JSON))
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
        }
    }

}
