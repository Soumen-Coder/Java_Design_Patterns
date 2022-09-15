package com.soumen.abstractfactory.gcp;

import com.soumen.abstractfactory.Instance;
import com.soumen.abstractfactory.Storage;

//Represents a concrete product in a family "GCP"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity){
        //Map capacity to GoogleComputeEngine instance types. Use aws API to provision
        System.out.println("Created an GoogleComputeEngine Instance with capacity ="+capacity);
    }

    @Override
    public void start(){
        System.out.println("Started an GoogleComputeEngine Instance");
    }

    @Override
    public void attachStorage(Storage storage){
        System.out.println("Attached "+storage+" to an GoogleComputeEngine Instance");
    }

    @Override
    public void stop(){
        System.out.println("Stopped an GoogleComputeEngine Instance");
    }

}
