package com.soumen.factorymethod;

public class JSONMessage extends Message{

    @Override
    public String getContent(){
        return "{\"JSON\":[]}";
    }
}
