package com.soumen.factorymethod;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeader(){
        System.out.println("Adding default headers");
    }

    public void encrypt(){
        System.out.println("Encrypting the message");
    }
}
