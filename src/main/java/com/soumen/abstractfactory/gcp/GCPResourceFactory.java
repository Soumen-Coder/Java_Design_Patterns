package com.soumen.abstractfactory.gcp;

import com.soumen.abstractfactory.Instance;
import com.soumen.abstractfactory.ResourceFactory;
import com.soumen.abstractfactory.Storage;


//Factory implementation for Google cloud platform resources
public class GCPResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity){
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capInMib){
        return new GoogleCloudStorage(capInMib);
    }
}
