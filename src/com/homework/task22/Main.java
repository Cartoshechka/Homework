package com.homework.task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  Comparator<Staff> staffComparator = new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.salary > o2.salary){
                    return -1;
                } else if (o1.salary < o2.salary){
                    return 1;
                }
                return 0;
            }
        };*/
        TreeSet<Staff> staffTreeSet = new TreeSet<Staff>();
//        TreeSet<Staff> staffTreeSet = new TreeSet<Staff>(staffComparator);
        System.out.println("Input the information about staff");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Set staff name or press enter");
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Set staff surname or press enter");
            String surname = reader.readLine();
            if (surname.isEmpty()) {
                break;
            }
            System.out.println("Set staff salary or press enter");
            Long sal = Long.parseLong(reader.readLine());
            if (sal == null){
                break;
            }
            staffTreeSet.add(new Staff(name, surname,sal));
        }
        System.out.println(staffTreeSet);

    }
}
