package com.soumen.threads;

public class MyThread extends Thread{

    public static int counter = 0;

    @Override
    public void run(){
        increment();
        decrement();
    }

    public void increment(){
        for (int i = 0; i < 1000000; i++) {
            counter = counter + i;
        }
        System.out.println("Increment :- " +counter);
    }

    public void decrement(){
        for (int i = 0; i < 1000000; i++) {
            counter = counter - i;
        }
        System.out.println("Decrement :- " +counter);
    }
    
}


class Client{
    public static void main(String[] args) {
        MyThread threadOne = new MyThread();
        threadOne.setName("Thread-One");
        threadOne.start();
        MyThread threadTwo = new MyThread();
        threadTwo.setName("Thread-Two");

        threadTwo.start();
        try {
            threadOne.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }

        Thread.getAllStackTraces().keySet().forEach(t -> System.out.println(t.getName() + " Alive "+t.isAlive()));

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());

        System.out.println("Done!");
    }
}
