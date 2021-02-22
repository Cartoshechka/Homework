package com.homework.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int nThreads = 10;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            Thread thread = new Thread(counter);
            executorService.submit(thread);
            threads.add(thread);
        }

        executorService.shutdown();
        for (Thread thr : threads) {
            thr.join();
            System.out.println(thr.getName() + " joined");
        }
        System.out.println("The result is " + Counter.getCounter());
    }
}

class Counter implements Runnable {
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