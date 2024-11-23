package ru.ivakhramov.java.basic.homeworks.lesson28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeworkLesson28Main {

    private static Object monitor = new Object();
    private static int currentLetter = 0;
    private static char[] letters = {'A', 'B', 'C'};

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable printA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printLetter(0);
                }
            }
        };

        Runnable printB = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printLetter(1);
                }
            }
        };

        Runnable printC = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printLetter(2);
                }
            }
        };

        executor.submit(printA);
        executor.submit(printB);
        executor.submit(printC);

        executor.shutdown();
    }

    private static void printLetter(int indexLetter) {

        synchronized (monitor) {
            while (currentLetter != indexLetter) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.print(letters[indexLetter]);
            currentLetter = (currentLetter + 1) % 3;
            monitor.notifyAll();
        }
    }
}
