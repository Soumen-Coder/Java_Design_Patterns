package com.soumen.threads;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SerialToParallelBegin {

    public static void copy(InputStream src, OutputStream dest) throws IOException{
        int value;
        while((value = src.read()) != -1){
            dest.write(value);
        }
    }

    public static void copyFile(String srcFile, String destFile) throws IOException{
        FileInputStream fin = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        copy(fin, fos);

        fin.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        String srcFile = "input.txt";
        String destFile = "output.txt";

        String srcFile2 = "input1.txt";
        String destFile2 = "output1.txt";

        copyFile(srcFile,destFile);
        copyFile(srcFile2,destFile2);

        System.out.println("Done!!!");
    }

}
