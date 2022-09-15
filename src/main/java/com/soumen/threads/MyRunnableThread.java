package com.soumen.threads;

public class MyRunnableThread implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }

}

class RunnableClient{
    public static void main(String[] args) {
        MyRunnableThread runnableThread = new MyRunnableThread();
        Thread myThread = new Thread(runnableThread);
        myThread.start();
        System.out.println("Done!!!");
    }
}
