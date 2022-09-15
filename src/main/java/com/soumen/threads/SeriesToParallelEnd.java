package com.soumen.threads;
import java.io.*;

public class SeriesToParallelEnd implements Runnable{

    String sourceFile;
    String destFile;

    SeriesToParallelEnd(String srcFile, String destFile){
        this.sourceFile = srcFile;
        this.destFile=destFile;
    }

    @Override
    public void run(){
        try {
            copyFile(sourceFile, destFile);
            System.out.println("Copied from - " + sourceFile + " to " + destFile);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void copy(InputStream src, OutputStream dest) throws IOException{
        int value;
        while((value = src.read()) != -1){
          dest.write(value);
        }
    }

    public static void copyFile(String srcFile, String destFile) throws IOException{
        FileInputStream fin = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        copy(fin,fos);

        fin.close();
        fos.close();
    }

    public static void main(String[] args) {
        String srcFile = "input.txt";
        String destFile = "output.txt";

        String srcFile2 = "input1.txt";
        String destFile2 = "output1.txt";

        SeriesToParallelEnd task = new SeriesToParallelEnd(srcFile, destFile);
        Thread threadOne = new Thread(task);
        threadOne.start();

        SeriesToParallelEnd taskSecond = new SeriesToParallelEnd(srcFile2, destFile2);
        Thread threadTwo = new Thread(taskSecond);
        threadTwo.start();

        System.out.println(Thread.activeCount());
        Thread.getAllStackTraces().keySet().forEach(t -> System.out.println(t.getName() + "  IsAlive? "+t.isAlive()));

        System.out.println("Main Method Job is Done!!!");
    }
}
