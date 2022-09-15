package com.soumen.solid.srp.solutions;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private String name;
    private String email;
    private String address;

    //Please make a habit of writing default Constructor, else you will get errors like InvalidDefinitionException
    public User(){
    }

    public User(String name, String email, String address){
        this.name=name;
        this.email=email;
        this.address=address;
    }
}
