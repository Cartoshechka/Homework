package com.homework.task23;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the wariant of work (reader or writer)");
        String input = reader.readLine();
        while (!(input.isEmpty())) {
            ReaderNWriterEnum readerNWriter = ReaderNWriterEnum.valueOf(input.toUpperCase());
            switch (readerNWriter) {
                case READER:
                    System.out.println(reading());
                    break;
                case WRITER:
                    System.out.println(writing());
                    break;
                default:
                    System.out.println("Incorrect case");
            }
        }

    }

    public static String reading() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String res = null;
        String sourceFileName;
        while (true) try {
            System.out.println("Type file name to get text from it");
            sourceFileName = reader.readLine();
            reader = new BufferedReader(new FileReader(sourceFileName));
            res = reader.readLine();
            break;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Type file name one more time");
            sourceFileName = reader.readLine();
            reader = new BufferedReader(new FileReader(sourceFileName));
            res = reader.readLine();
            break;
        }
        return res;
    }

    public static String writing() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) try {
            System.out.println("Type file name in which you want to write something");
            OutputStream outputStream = new FileOutputStream(reader.readLine());
            System.out.println("Type writing text");
            String userText = reader.readLine();
            outputStream.write(userText.getBytes());
            break;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Try to type file name again");
            OutputStream outputStream = new FileOutputStream(reader.readLine());
            System.out.println("Type writing text");
            String userText = reader.readLine();
            outputStream.write(userText.getBytes());
        }
        return "Ready";
    }
}
