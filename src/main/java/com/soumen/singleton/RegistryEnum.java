package com.soumen.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum is clean way to create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 * MAKE SURE YOUR SINGLETONS ARE NOT CARRYING A LOT OF MUTABLE GLOBAL STATES - IT SHOULD BE ALMOST IMMUTABLE IN NATURE
 * IT IS ALSO AN ANTI PATTERN - SINCE AT TIMES IT CAN HAVE A LOT OF MUTABLE STATES
 * java.lang.Runtime in rt.jar is an example of Singleton design pattern uses EAGER INITIALIZATION
 * Most common way to implement Singletons is through a Static variable and they are held per CLASS LOADER AND NOT PER JVM
 */

//Objects cannot be created with Enums, but enums are confusing
//Enums helps with serialization issues, while deserialize the singleton objects in the previous methods, you can end up creating
//two different objects but enums cannot be desialized hence it solves that problem
public enum RegistryEnum {

    INSTANCE; // This is the object and this is all for enums

    public void getInstance(){
        //Do stuffs here
    }

}
