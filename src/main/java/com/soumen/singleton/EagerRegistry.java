package com.soumen.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */


public class EagerRegistry {

    //Constructor should be made private in case of Singletons, since creation of objects from outside is not allowed
    private EagerRegistry(){

    }

    //static variable, initializes and instantiates when the class load, assigns memory and create the object, address same for all objects
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    //static method to be called from outside
    public static EagerRegistry getInstance(){
        return INSTANCE;
    }


}
