package com.homework.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print first number");
        int n1 = Integer.parseInt(reader.readLine());
        System.out.println("Print second number");
        int n2 = Integer.parseInt(reader.readLine());
        System.out.println("Choose operator");
        System.out.println("Plus\nMinus\nMultiply\nDivide");
        String op = reader.readLine().toUpperCase(Locale.ROOT);

        Operations.calculate(n1, op , n2);
    }
}
interface Calculator {
    int calculate(int a, int b);
}
enum Operations implements Calculator {
    PLUS(Integer::sum),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);
    static Map<String, Operations> mapOperations = Map.of(
            "PLUS", Operations.PLUS,
            "MINUS", Operations.MINUS,
            "MULTIPLY", Operations.MULTIPLY,
            "DIVIDE", Operations.DIVIDE
    );
    Calculator operator;

    Operations(Calculator operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b) {
        return operator.calculate(a, b);
    }

    public static void calculate(int a, String operation, int b) {
        System.out.println(mapOperations.get(operation).calculate(a, b));
    }
}
