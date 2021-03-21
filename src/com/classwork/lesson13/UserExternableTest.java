package com.classwork.lesson13;

import java.io.*;

import static com.classwork.lesson13.FileUtils.readFromFile;
import static com.classwork.lesson13.FileUtils.writeToFile;

public class UserExternableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Ivan", "test");
        writeToFile(user, "user.dat");
        User user1 = (User) readFromFile("user.dat");
        System.out.println(user1);
    }

}
