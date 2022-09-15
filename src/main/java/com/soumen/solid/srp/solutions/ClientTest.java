package com.soumen.solid.srp.solutions;

import java.io.IOException;

public class ClientTest {

    private static final String VALID_JSON="{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110Sugarlane\"}";
    private static final String INVALID_JSON="{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    public static void main(String[]args) throws IOException {
        UserController userController = new UserController();
        String response = userController.createUser(VALID_JSON);

        if (!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }

        System.out.println("Valid Response = " + response);

        response = userController.createUser(INVALID_JSON);
        if(!response.equalsIgnoreCase("ERROR")){
            System.err.println("Failed");
        }
        System.out.println("Invalid Response = "+response);


    }

}
