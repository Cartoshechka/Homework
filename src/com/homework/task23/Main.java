package com.homework.task23;

import java.io.*;

public class Main {
    static User info;
    public static void main(String[] args) throws IOException {
        BufferedReader switchReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the wariant of work (reader or writer)");
        String input = switchReader.readLine();
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
        String sourceFileName;
        try {
            System.out.println("Type file name to get text from it");
            sourceFileName = reader.readLine();
            reader = new BufferedReader(new FileReader(sourceFileName));
            info = new User(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Type file name one more time");
            sourceFileName = reader.readLine();
            reader = new BufferedReader(new FileReader(sourceFileName));
            info = new User(reader.readLine());
        }
        return "Information in file: " + info.getInfo();
    }

    public static String writing() throws IOException {
        BufferedReader writer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Type file name in which you want to write something");
            OutputStream outputStream = new FileOutputStream(writer.readLine());
            System.out.println("Type writing text");
            info = new User(writer.readLine());
            String userText = info.getInfo();
            System.out.println("Are you sure about this text? " + userText);
            System.out.println("Print Y or N");
            String userAnswer = writer.readLine();
            if (userAnswer.equals("N") || userAnswer.equals("n")) {
                System.out.println("Print new text");
                info = new User(writer.readLine());
                userText = info.getInfo();
            }
            outputStream.write(userText.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Try to type file name again");
            OutputStream outputStream = new FileOutputStream(writer.readLine());
            System.out.println("Type writing text");
            info = new User(writer.readLine());
            String userText = info.getInfo();
            System.out.println("Are you sure about this text? " + userText);
            System.out.println("Print Y or N");
            String userAnswer = writer.readLine();
            if (userAnswer.equals("N") || userAnswer.equals("n")) {
                System.out.println("Print new text");
                info = new User(writer.readLine());
                userText = info.getInfo();
            }
            outputStream.write(userText.getBytes());
        }
        return "Written text: " + info.getInfo();
    }
}
