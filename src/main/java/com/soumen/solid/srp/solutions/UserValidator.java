package com.soumen.solid.srp.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Class for validating a user
public class UserValidator {

    public boolean validateUser(User user){
        return isValidUser(user);
    }

    //validates the user object
    public boolean isValidUser(User user){
        if(!isPresent(user.getName())){
            return false;
        }
        user.setName(user.getName().trim());

        if(!isAlphanumeric(user.getName())){
            return false;
        }

        if(!isAlphanumeric(user.getAddress())){
            return false;
        }

        if(user.getEmail()==null || user.getEmail().length()==0){
            return false;
        }
        user.setEmail(user.getEmail().trim());

        if(!isEmail(user.getEmail())){
            return false;
        }

        return true;
    }

    public boolean isPresent(String username){
        return username!=null && username.trim().length()>0;
    }

    public boolean isAlphanumeric(String nameAndAddress){
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(nameAndAddress);
        return !matcher.find();
    }

    public boolean isEmail(String email){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}
