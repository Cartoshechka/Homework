package com.homework.task24;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName;
        String destinationFileName;
        FileInputStream fileInputStream;
        try {
            System.out.println("Type file name which you want to copy ");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Type file name one more time");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);

        }
        System.out.println("Type file name in which you want to copy");
        destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Byte copied-> " + count);

        fileInputStream.close();
        fileOutputStream.close();

    }
}
