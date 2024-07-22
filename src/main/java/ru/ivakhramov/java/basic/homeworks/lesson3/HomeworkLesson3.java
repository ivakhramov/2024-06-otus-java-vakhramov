package ru.ivakhramov.java.basic.homeworks.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson3 {

    public static void main(String[] args) {

        // * При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполните метод,
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

        Random random = new Random();
        if (usersChoice == 1) {
            // 1. Метод, при вызове печатающий в столбец 4 слова
            greetings();
        } else if (usersChoice == 2) {
            int a = random.nextInt();
            int b = random.nextInt();
            int c = random.nextInt();
            // 2. Метод, считающий сумму аргументов, и если она больше или равна 0, выводящий в консоль сообщение
            checkSign(a, b, c);
        } else if (usersChoice == 3) {
            // 3. Метод, выводящий сообщение “Красный”, “Желтый” или “Зеленый” в зависимости от аргумента
            selectColor();
        } else if (usersChoice == 4) {
            // 4. Метод, сравнивающий аргументы
            compareNumbers();
        } else {
            int initValue = random.nextInt();
            int delta = random.nextInt();
            boolean increment = random.nextBoolean();
            // 5. Метод, прибавляющий или вычитающий дельту в зависимости от инкремента
            addOrSubtractAndPrint(initValue, delta, increment);
        }

    }

    // 1. Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
    // Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    // 2. Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
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

    // 3. Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int data = (int)(Math.random() * 30 + 1);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b
    // с любыми начальными значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение
    // “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
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