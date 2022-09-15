package com.soumen.singleton;

public class Client {

    public static void main(String[] args) {

        EagerRegistry instance = EagerRegistry.getInstance();
        EagerRegistry instance2 = EagerRegistry.getInstance();

        System.out.println(instance == instance2);


        LazyRegistryWithDCL lazyInstance = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyInstance2 = LazyRegistryWithDCL.getInstance();

        System.out.println(lazyInstance == lazyInstance2);


        LazyRegistryIODH lazyInstanceIODH1; // Checking when the object is actually created, it doesn't create on loading
        lazyInstanceIODH1 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyInstanceIODH2 = LazyRegistryIODH.getInstance();

        System.out.println(lazyInstanceIODH1 == lazyInstanceIODH2);


    }

}
