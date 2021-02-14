package com.homework.test;

import java.io.*;

public class FIleReaderTest {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(destinationFileName);

        int value = 0;

        while ((value = fileInputStream.read()) >= 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            value++;
        }

        System.out.println("Скопировано байт " + value);

        fileInputStream.close();
        fileOutputStream.close();

    }
}
