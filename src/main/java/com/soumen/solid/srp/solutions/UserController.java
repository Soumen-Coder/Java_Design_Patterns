package com.soumen.solid.srp.solutions;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

//Handles incoming Json Requests that creates users
public class UserController {

    private UserPersistenceService service = new UserPersistenceService();

    public String createUser(String jsonReq) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(jsonReq, User.class);

        UserValidator validator = new UserValidator();
        boolean isValid = validator.validateUser(user);

        if(!isValid){
            System.out.println("Not a valid format");
            return "ERROR";
        }

        service.saveUser(user);

        return "SUCCESS";

    }

}
