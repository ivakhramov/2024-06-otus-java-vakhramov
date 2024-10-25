package ru.ivakhramov.java.basic.homeworks.lesson20;

public class Calculator {

    public static double calculate (double a, double b, String arithmetic) {

        double result;
        if (arithmetic.equals("+")) {
            result = a + b;
        } else if (arithmetic.equals("-")) {
            result = a - b;
        } else if (arithmetic.equals("*")) {
            result = a * b;
        } else if (arithmetic.equals("/")) {
            if (b == 0) {
                throw new IllegalArgumentException("Делить на ноль нельзя");
            }
            result = a / b;
        } else {
            throw new IllegalArgumentException("Некорректная арифметическая операция: " + arithmetic);
        }
        return result;
    }
}
