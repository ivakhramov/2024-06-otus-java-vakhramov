package ru.ivakhramov.java.basic.homeworks.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson3 {

    public static void main(String[] args) {

        // (*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполните метод,
        // соответствующий указанному номеру со случайным значением аргументов;
        Scanner scanner = new Scanner(System.in);
        int usersChoice = 0;
        System.out.println("Введите число от 1 до 5");
        if (scanner.hasNextInt()) {
            while (usersChoice < 1 || usersChoice > 5) {
                usersChoice = scanner.nextInt();
                if (usersChoice < 1 || usersChoice > 5) {
                    System.out.println("Ваш ввод не соответствует условию. Введите число от 1 до 5");
                }
            }
        } else {
            System.out.println("Ваш ввод не соответствует условию. Перезапустите программу Alt+Shift+F10");
        }
        // System.out.println(usersChoice); // Вывод в консоль для проверки

        Random random = new Random();
        if (usersChoice == 1) {
            greetings();
        } else if (usersChoice == 2) {
            int a = random.nextInt();
            int b = random.nextInt();
            int c = random.nextInt();
            // System.out.println("a = " + a + ", b = " + b + ", c = " + c); // Вывод в консоль для проверки
            // System.out.println("a + b + c = " + (a + b + c));             // Вывод в консоль для проверки
            checkSign(a, b, c); // При сумме будет происходить переполнение. Специально оставил так, так как в этом случае есть и отрицательные и положительные числа, а на смысл задачи не влияет
        } else if (usersChoice == 3) {
            selectColor();
        } else if (usersChoice == 4) {
            compareNumbers();
        } else {
            int initValue = random.nextInt();
            int delta = random.nextInt();
            boolean increment = random.nextBoolean();
            // System.out.println("initValue = " + initValue + ", delta = " + delta + ", increment = " + increment); // Вывод в консоль для проверки
            // System.out.println("Если true: initValue + delta = " + (initValue + delta) + ", eсли false: initValue - delta = " + (initValue - delta)); // Вывод в консоль для проверки
            addOrSubtractAndPrint(initValue, delta, increment);
        }

    }

    // (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
    // Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    // (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение
    // “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int data = (int)(Math.random() * 30 + 1); // Решил ограничить data диапазоном (0; 30], так как при таком диапазоне разные цвета будут выпадать более-менее равномерно. Использовал Math.random() вместо класса Random для тренировки
        // System.out.println("data = " + data); // Вывод в консоль для проверки
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b
    // с любыми начальными значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение
    // “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        Random random = new Random(); // по условиям метод не должен в себя принимать аргументов. Пришлось ещё раз создать random внутри
        int a = random.nextInt();
        int b = random.nextInt();
        // System.out.println("a = " + a + ", b = " + b); // Вывод в консоль для проверки
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // (5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    // в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}