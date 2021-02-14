package com.homework.task24;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName;
        String destinationFileName;
        FileInputStream fileInputStream;
        try {
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
            System.out.println("Введите название файла ещё раз");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);

        }
        destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }


        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();

    }
}
