package com.homework.task18;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, LocalDate> map = new HashMap<String, LocalDate>();

        map.put("Schwarzenegger0",LocalDate.of(1947,8,30));
        map.put("Schwarzenegger1",LocalDate.of(1947,7,25));
        map.put("Schwarzenegger2",LocalDate.of(1947,9,17));
        map.put("Schwarzenegger3",LocalDate.of(1947,1,20));
        map.put("Schwarzenegger4",LocalDate.of(2001,2,19));
        map.put("Schwarzenegger5",LocalDate.of(1947,3,31));
        map.put("Schwarzenegger6",LocalDate.of(1947,4,2));
        map.put("Schwarzenegger7",LocalDate.of(1947,5,5));
        map.put("Schwarzenegger8",LocalDate.of(1947,6,7));
        map.put("Schwarzenegger9",LocalDate.of(1947,12,9));
        System.out.println(map.toString());
        List<String> mapKeys = new ArrayList<>(map.keySet());


        for (String element : mapKeys) {
            Month month = map.get(element).getMonth();
            if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST){
                map.remove(element);
            }
        }
        System.out.println(map.toString());
    }

}
