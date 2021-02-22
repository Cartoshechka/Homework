package com.homework.task26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread thread0 = new Thread(counter);
            thread0.start();
            System.out.println(thread0.getName() + " started");
            threads.add(thread0);
        }
        for (Thread thr : threads) {
            thr.join();
            System.out.println(thr.getName() + " joined");
        }
        System.out.println("The result is " + Counter1.getCounter());
    }
}

class Counter1 implements Runnable {
    private static Integer counter = 0;

    private static void nextCounter() {
        counter++;
    }

    public static Integer getCounter() {
        return counter;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                nextCounter();
            }
        }
    }
}