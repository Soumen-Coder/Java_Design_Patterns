package com.soumen.singleton;
/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */

public class LazyRegistryWithDCL {

    //no objects allowed, inheritance to be cutoff
    private LazyRegistryWithDCL(){

    }

    //private should not be allowed to access from outside, volatile because the threads happens to cache results
    //volatile prevents caching, so that it shouldn't pick results from cache, it checks from main memory, unique object is required
    private static volatile LazyRegistryWithDCL instance = null;

    //Only one public method
    public static LazyRegistryWithDCL getInstance(){
        //double check locking - two times checking instance == null
        if(instance == null){
            //it prevents two threads to enter into method at the same time
            synchronized(LazyRegistryWithDCL.class){ // synchronized(this) is not allowed because this refers to object and it is used inside a static method, hence class name with .class is required
                if(instance == null){
                    instance = new LazyRegistryWithDCL();
                }
            }
        }
        return instance;
    }
}
