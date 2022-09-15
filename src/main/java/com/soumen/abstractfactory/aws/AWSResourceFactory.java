package com.soumen.abstractfactory.aws;

import com.soumen.abstractfactory.Instance;
import com.soumen.abstractfactory.ResourceFactory;
import com.soumen.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AWSResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity){
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capInMib){
        return new S3Storage(capInMib);
    }
}
