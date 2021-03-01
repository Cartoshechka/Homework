package com.homework.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;

public class Main {
    static Integer a;
    static Integer b;
    public static Map<Operations, Integer> MapOperator = Map.of(
            Operations.PLUS, Calculator.add(a, b),
            Operations.MINUS, Calculator.sub(a,b),
            Operations.MULTIPLY, Calculator.mul(a,b),
            Operations.DIVIDE, Calculator.div(a,b)
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        String input = br.readLine().toUpperCase(Locale.ROOT);
        Operations op = Operations.valueOf(input);
        System.out.println();

    }

static class Calculator {
    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer sub(Integer a, Integer b) {
        return a - b;
    }

    public static Integer div(Integer a, Integer b) {
        return a / b;
    }

    public static Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
    enum Operations {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE
    }
}