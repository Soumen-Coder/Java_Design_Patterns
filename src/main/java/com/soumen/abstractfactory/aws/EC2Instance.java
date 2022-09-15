package com.soumen.abstractfactory.aws;

import com.soumen.abstractfactory.Instance;
import com.soumen.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web services"
public class EC2Instance implements Instance {

    public EC2Instance(Capacity capacity){
        //Map capacity to ec2 instance types. Use aws API to provision
        System.out.println("Created an EC2 Instance with capacity ="+capacity);
    }

    @Override
    public void start(){
        System.out.println("Started an EC2 Instance");
    }

    @Override
    public void attachStorage(Storage storage){
        System.out.println("Attached "+storage+" to an EC2 Instance");
    }

    @Override
    public void stop(){
        System.out.println("Stopped an EC2 Instance");
    }

}
