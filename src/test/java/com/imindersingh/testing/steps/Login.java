package com.imindersingh.testing.steps;

import com.imindersingh.testing.httprequests.RequestHandler;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import netscape.javascript.JSObject;
import org.json.JSONObject;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Login {

    @Step(" Login to reqres with email <email> and password <password>")
    public void loginWithEmailAndPassword(final String email, final String password) throws IOException {
        JSONObject body = new JSONObject();
        body.put("email", email);
        body.put("password", password);

        RequestHandler request = new RequestHandler();
        request.post(body.toString());
    }

    @Step("Then the response will be 200")
    public void assertHttpResponseCode() {
        //assert against response - make response static
    }

    @Step("Response contains token")
    public void assertResponseContainsToken(Table wordsTable) {

    }

}
