package com.soumen.abstractfactory;

import com.soumen.abstractfactory.aws.AWSResourceFactory;
import com.soumen.abstractfactory.aws.S3Storage;
import com.soumen.abstractfactory.gcp.GCPResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory factory){
        this.resourceFactory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int capInMib){
        Instance instance = resourceFactory.createInstance(cap);
        Storage storage = resourceFactory.createStorage(capInMib);
        instance.attachStorage(storage);
        return instance;

    }

    public static void main(String[] args) {

        Client aws = new Client(new AWSResourceFactory());
        Instance awsInstance = aws.createServer(Instance.Capacity.small, 2048);
        awsInstance.start();
        awsInstance.stop();

        Client gcp = new Client(new GCPResourceFactory());
        Instance gcpInstance = gcp.createServer(Instance.Capacity.large, 6536);
        gcpInstance.start();
        gcpInstance.stop();


    }

}
