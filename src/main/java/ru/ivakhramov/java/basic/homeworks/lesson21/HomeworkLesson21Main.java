package ru.ivakhramov.java.basic.homeworks.lesson21;

public class HomeworkLesson21Main {

    /**
     * Необходимо выполнить две реализации задачи заполнения массива
     * <p>
     * Реализация №1:
     * - Реализуйте метод, который создает double массив длиной 100_000_000 элементов
     * - Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
     * array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
     * - Засеките время выполнения цикла и выведите его в консоль.
     * <p>
     * Реализация №2:
     * - Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно.
     * То есть первый поток заполняет первую четверть массива, второй - вторую и т.д.
     * И посмотрите насколько быстрее выполнится работа по сравнению с одним потоком.
     */

    public static void main(String[] args) {

        final int ARRAY_SIZE = 100_000_000;

        long implementation1 = runTimeFillingArray(ARRAY_SIZE, 1);
        long implementation2 = runTimeFillingArray(ARRAY_SIZE, 4);

        System.out.println("Цикл for заполнивший массив одним потоком отработал за " + implementation1 + " миллисекунд");
        System.out.println("Цикл for заполнивший массив четырьмя потоками отработал за " + implementation2 + " миллисекунд");

        System.out.println("Разница заполнения массива между одним и четырьмя потоками " + (implementation1 - implementation2) + " миллисекунд");
    }

    public static long runTimeFillingArray(int arraySize, int numberOfThreads) {

        double[] array = new double[arraySize];
        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            int index = i;
            threads[i] = new Thread(() ->
                    fillingArray(array, (arraySize / numberOfThreads) * index, (arraySize / numberOfThreads) * (index + 1))
            );
        }

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long finishTime = System.currentTimeMillis() - startTime;
        return finishTime;
    }

    public static void fillingArray(double[] array, int startFori, int finishFori) {

        for (int i = startFori; i < finishFori; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
