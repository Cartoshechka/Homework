package com.homework.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    static Integer a;
    static Integer b;
    public final static Map<Operations,Integer> mapOperator = new HashMap<>();
//       static {   mapOperator.put(Operations.PLUS, new Plus().apply();
   /*         Operations.MINUS, Minus::Calculate,
            Operations.MULTIPLY, Multiply::Calculate,
            Operations.DIVIDE, Divide::Calculate*/
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        String input = br.readLine().toUpperCase(Locale.ROOT);
        Operations op = Operations.valueOf(input);
        Integer integer = mapOperator.get(op);
        System.out.println(integer);

    }
public static class Plus implements Calculator{
    public Integer apply() {
        return a+b;
    }

}
}
enum Operations {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE
}