package com.soumen.factorymethod;

public class Client {
    public static void main(String[] args) {

        Message textMessage = printMessage(new TextMessageCreator());
        System.out.println(textMessage.getContent());

        Message jsonMessage = printMessage(new JSONMessageCreator());
        System.out.println(jsonMessage.getContent());
    }

    public static Message printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        return msg;
    }

}
