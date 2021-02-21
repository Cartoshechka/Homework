package com.homework.task26;


public class Main {
    public static void main(String[] args) throws InterruptedException {
      /*  Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(counter);
            System.out.println(thread.getName() + " starting");
            thread.start();
            System.out.println(thread.getName() + " joining");
            thread.join();
        }*/

        for (int i = 0; i < 10; i++) {
            Counter counter = new Counter();
            counter.start();
            System.out.println(counter.getName() + " started");
            counter.join();
            System.out.println(counter.getName() + " joined");
        }
    }
}

/*class Counter implements Runnable {
    private static int counter;

    private static void nextCounter() {
        counter++;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (counter != 1000) {
                nextCounter();
            }
            System.out.println(counter);
        }
    }
}*/
class Counter extends Thread {
    private static int counter;

    private static void nextCounter() {
        counter++;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (counter != 1000) {
                nextCounter();
            }
            System.out.println("The result is "+ counter + " work done at: "  + getName());
        }
    }
}
