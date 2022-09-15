package com.soumen.objectpool;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool<T extends Poolable>{

    private BlockingQueue<T> availablePool; //in memory cache

    public ObjectPool(Supplier<T> creator, int noOfObject){
        availablePool = new LinkedBlockingQueue<>();
        IntStream.range(0, noOfObject).forEach(i-> availablePool.offer(creator.get()));
    }

    public T get(){
        try{
            return availablePool.take();
        }catch(Exception e){
            System.err.println("Cannot take from the in memory cache which is LinkedBlockingQueue in our case and it is synchronous");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try{
            availablePool.put(obj);
        }catch(Exception e){
            System.err.println("Could not put back to the pool of objects which is in memory in our case");
        }
    }
}
