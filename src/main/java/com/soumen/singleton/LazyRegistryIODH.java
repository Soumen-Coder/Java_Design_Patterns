package com.soumen.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization. - Lazy Initialization Holder Class Idiom
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH(){
        System.out.println("Object is not created while loading since it is inside a static class");
    }

    private static class RegistryHolder{
        static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }


}
