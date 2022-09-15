package com.soumen.abstractfactory.aws;

import com.soumen.abstractfactory.Storage;
//Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMib){
        //Use aws s3 api
        System.out.println("Attached "+capacityInMib+" to S3 Storage");
    }

    @Override
    public String getId(){
        return "S31";
    }

    @Override
    public String toString(){
        return "S3 Storage";
    }
}
