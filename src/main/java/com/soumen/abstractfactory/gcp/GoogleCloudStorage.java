package com.soumen.abstractfactory.gcp;

import com.soumen.abstractfactory.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib){
        //Use gcp api
        System.out.println("Attached "+capacityInMib+" to GoogleCloud Storage");
    }

    @Override
    public String getId(){
        return "GCPCS1";
    }

    @Override
    public String toString(){
        return "GCPCS1 Storage";
    }
}
