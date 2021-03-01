package com.homework.task27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) throws IOException {
        Supplier<String> stringSupplier = () -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };
        String userText = stringSupplier.get();
        UnaryOperator<String> duplicateLetters = text -> {
           StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length() ; i++) {
                builder.append(text.charAt(i)).append(text.charAt(i));

            }
            return builder.toString();
        };
        System.out.println("Your text with duplicated letters: " + duplicateLetters.apply(userText));


    }
}
