package ru.ivakhramov.java.basic.homeworks.lesson7;

import java.util.Arrays;

public class HomeworkLesson7 {

    public static void main(String[] args) {

        // 1. Метод, считающий и возвращающий сумму всех элементов массива, которые больше 0
        int[][] testArray11 = {{-5, 5, 0, 1, -1}, {0, -1, -5}, {6, 0}, {8, -1, 2, 0}};
        int[][] testArray12 = {{-5, -5, 0, -1, -1}, {0, -1, -5}, {-6, 0}, {-8, -1, -2, 0}};
        System.out.println(sumOfPositiveElements(testArray11)); // 22
        System.out.println(sumOfPositiveElements(testArray12)); // 0

        // 2. Метод, печатающий в консоль квадрат из символов * со сторонами соответствующей длины
        printSquare(5);
        printSquare(1);
        printSquare(0);
        printSquare(-5);

        // 3. Метод, зануляющий диагональные элементы массива
        int[][] testArray31 = {{5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}};
        doZeroDiagonalElements(testArray31);

        // 4. Метод ищущий и возвращающий максимальный элемент массива
        int[][] testArray41 = {{-5, 5, 0, 1, -1}, {0, -1, -5}, {6, 0}, {8, -1, 2, 0}};
        int[][] testArray42 = {{-5, -5, -111, -12, -17}, {-11, -1, -5}, {-6, -16}, {-8, -3, -2, -7}};
        System.out.println(findMax(testArray41)); // 8
        System.out.println(findMax(testArray42)); // -1

        // 5. Метод, считающий сумму элементов второй строки или столбца двумерного массива (по вашему выбору),
        // если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
        int[][] testArray51 = {{-5, 5, 0, 1, -1}, {0, -1, 5}, {6, 0}, {8, -1, 2, 0}};
        int[][] testArray52 = {{-5, -5, -111, -12, -17}, {-11, -1, -5}, {-6, -16}, {-8, -3, -2, -7}};
        int[][] testArray53 = {{-5, 5, 0, 1, -1}, {}, {6, 0}, {8, -1, 2, 0}};
        System.out.println(sumElementsOfSecondLineArray(testArray51)); // 4
        System.out.println(sumElementsOfSecondLineArray(testArray52)); // -17
        System.out.println(sumElementsOfSecondLineArray(testArray53));
    }

    // 1. Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
    public static int sumOfPositiveElements(int[][] arr) {

        int sumOfPositiveElements = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sumOfPositiveElements += arr[i][j];
                }
            }
        }
        return sumOfPositiveElements;
    }

    // 2. Реализовать метод, который принимает в качестве аргумента int size
    // и печатает в консоль квадрат из символов * со сторонами соответствующей длины
    public static void printSquare(int size) {

        if (size <= 0) {
            System.out.println("Введите число больше 0");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3. Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив,
    // и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
    // Проверять количество строк и столбцов не требуется, условие “квадратности” нужно, чтобы упростить работу с диагоналями
    public static void doZeroDiagonalElements(int[][] squareArr) {

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i][i] = 0;
            squareArr[i][squareArr.length - 1 - i] = 0;
        }

        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 4. Реализовать метод findMax(int[][] array)
    // который должен найти и вернуть максимальный элемент массива
    public static int findMax(int[][] array) {

        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }

    // 5. Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по вашему выбору),
    // если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
    public static int sumElementsOfSecondLineArray(int[][] array) {

        if (array[1].length == 0) {
            return -1;
        }

        int sumElementsOfSecondLineArray = 0;
        for (int j = 0; j < array[1].length; j++) {
            sumElementsOfSecondLineArray += array[1][j];
        }
        return sumElementsOfSecondLineArray;
    }
}
