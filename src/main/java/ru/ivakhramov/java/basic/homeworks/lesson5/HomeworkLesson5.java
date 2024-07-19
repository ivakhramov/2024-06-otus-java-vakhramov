package ru.ivakhramov.java.basic.homeworks.lesson5;

import java.util.Arrays;

public class HomeworkLesson5 {

    public static void main(String[] args) {

        // 1. Метод, печатающий в консоль строку указанное количество раз
        printStringNTimes(5, "Hello World"); // 5 раз "Hello World" с новой строки

        // 2. Метод, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль
        sumElementsArrayGreaterFive(1, 5, 6, 0, 7, 11, 5, 7, 9, -7); // 40
        sumElementsArrayGreaterFive(1, 5, 2, 0, 5, 4, 5, 0, 5, -7);  // В массиве нет элементов больше 5

        // 3. Метод, заполняющий каждую ячейку массива указанным числом
        int[] testArray31 = new int[10];
        fillArrayNumber(5, testArray31); // {5, 5, 5, 5, 5, 5, 5, 5, 5, 5}

        // 4. Метод, увеличивающий каждый элемент массива на указанное число
        int[] testArray41 = {0, 1, 5, 4, 2, -12, 9, 7, -5, 10};
        incrementArrayElementsNumber(5, testArray41); // {5, 6, 10, 9, 7, -7, 14, 12, 0, 15}

        // 5. Метод, печатающий в консоль информацию о том, сумма элементов какой из половин массива больше
        int[] testArray51LargerLeft = {11, 5, 7, 9, -7, 1, 5, 6, 0, 7};
        int[] testArray52LargerRight = {1, 5, 6, 0, 7, 11, 5, 7, 9, -7};
        int[] testArray53Equal = {11, 5, 7, 9, -7, 11, 5, 7, 9, -7};
        int[] testArray54Odd = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        sumLargerHalfArray(testArray51LargerLeft);  // слева 25, справа 19
        sumLargerHalfArray(testArray52LargerRight); // слева 19, справа 25
        sumLargerHalfArray(testArray53Equal);       // слева 25, справа 25
        sumLargerHalfArray(testArray54Odd);         // нечетный массив

        // * 6. Метод, принимающий на вход набор целочисленных массивов, и получающий новый массив равный сумме входящих
        int[] testArray61 = {1, 2, 3};
        int[] testArray62 = {2, 2};
        int[] testArray63 = {1, 1, 1, 1, 1};
        sumMultipleArrays(testArray61, testArray62, testArray63); // {4, 5, 4, 1, 1}

        // * 7. Метод, проверяющий, что есть “точка” в массиве, в которой суммы левой и правой части равны
        int[] testArray70positive = {1, 1, 1, 1, 1, 5};
        int[] testArray71positive = {5, 3, 4, -2};
        int[] testArray72positive = {7, 2, 2, 2};
        int[] testArray73positive = {9, 4};
        int[] testArray74positive = {2, 2, 2, 2, 2, 2};
        int[] testArray75negative = {-1, -1, -1, -1, -1, -5};
        int[] testArray76negative = {-5, -3, -4, 2};
        int[] testArray77negative = {-7, -2, -2, -2};
        int[] testArray78negative = {-9, -4};
        int[] testArray79negative = {-2, -2, -2, -2, -2, -2};
        hasBalancePoint(testArray70positive); // { 1, 1, 1, 1, 1, | 5 }
        hasBalancePoint(testArray71positive); // { 5, | 3, 4, -2 }
        hasBalancePoint(testArray72positive); // нет точки баланса
        hasBalancePoint(testArray73positive); // нет точки баланса
        hasBalancePoint(testArray74positive); // { 2, 2, 2, | 2, 2, 2 }
        hasBalancePoint(testArray75negative); // { -1, -1, -1, -1, -1, | -5 }
        hasBalancePoint(testArray76negative); // { -5, | -3, -4, 2 }
        hasBalancePoint(testArray77negative); // нет точки баланса
        hasBalancePoint(testArray78negative); // нет точки баланса
        hasBalancePoint(testArray79negative); // { -2, -2, -2, | -2, -2, -2 }

        // * 8. Метод, проверяющий, что все элементы массива идут в порядке убывания или возрастания
        int[] testArray81Increasing = {-7, -2, 0, 5, 7, 17};
        int[] testArray82Decreasing = {17, 7, 5, 0, -2, -7};
        int[] testArray83Chaotic = {-7, -2, 0, 5, 3, 17};
        int[] testArray84Chaotic = {17, 7, 5, 0, 3, -7};
        int[] testArray85Same = {2, 2, 2, 2, 2, 2};
        int usersChoiceDecreasing = 1;
        int usersChoiceIncreasing = 2;
        hasArraySorted(testArray81Increasing, usersChoiceDecreasing); // возрастающий
        hasArraySorted(testArray82Decreasing, usersChoiceDecreasing); // убывающий
        hasArraySorted(testArray83Chaotic, usersChoiceDecreasing);    // хаотичный
        hasArraySorted(testArray84Chaotic, usersChoiceDecreasing);    // хаотичный
        hasArraySorted(testArray85Same, usersChoiceDecreasing);       // ровный
        hasArraySorted(testArray81Increasing, usersChoiceIncreasing); // возрастающий
        hasArraySorted(testArray82Decreasing, usersChoiceIncreasing); // убывающий
        hasArraySorted(testArray83Chaotic, usersChoiceIncreasing);    // хаотичный
        hasArraySorted(testArray84Chaotic, usersChoiceIncreasing);    // хаотичный
        hasArraySorted(testArray85Same, usersChoiceIncreasing);       // ровный

        // * 9. Метод, “переворачивающий” входящий массив
        reverseArray(new int[]{1, 2, 3, 4});    // {4, 3, 2, 1}
        reverseArray(new int[]{1, 2, 3, 4, 5}); // {5, 4, 3, 2, 1}
    }

    // 1. Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз
    public static void printStringNTimes(int n, String str) {

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // 2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль
    public static void sumElementsArrayGreaterFive(int... arr) {

        int sumElementsArrayGreaterFive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sumElementsArrayGreaterFive += arr[i];
            }
        }

        if (sumElementsArrayGreaterFive > 5) {
            System.out.println(sumElementsArrayGreaterFive);
        } else {
            System.out.println("В массиве нет элементов больше 5");
        }
    }

    // 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполнить каждую ячейку массива указанным числом
    public static void fillArrayNumber(int n, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент массива на указанное число
    public static void incrementArrayElementsNumber(int n, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль информацию о том, сумма элементов какой из половин массива больше
    public static void sumLargerHalfArray(int[] arr) {

        if (arr.length % 2 != 0) {
            System.out.println("Массив имеет нечетное количество элементов. Сравнить правую и левую часть не возможно");
            return;
        }

        int sumLeftHalfArray = 0;
        int sumRightHalfArray = 0;
        for (int i = 0; i < (arr.length / 2); i++) {
            sumLeftHalfArray += arr[i];
            sumRightHalfArray += arr[(arr.length - 1) - i];
        }

        if (sumLeftHalfArray > sumRightHalfArray) {
            System.out.println("Сумма элементов левой части массива больше суммы элементов правой части массива");
        } else if (sumLeftHalfArray < sumRightHalfArray) {
            System.out.println("Сумма элементов правой части массива больше суммы элементов левой части массива");
        } else {
            System.out.println("Суммы элементов правой и левой частей массивов равны");
        }
    }

    // * 6. Реализуйте метод, принимающий на вход набор целочисленных массивов,
    // и получающий новый массив равный сумме входящих
    // Пример: { 1, 2, 3 }
    //       + { 2, 2 }
    //       + { 1, 1, 1, 1, 1}
    //       = { 4, 5, 4, 1, 1 }
    public static void sumMultipleArrays(int[]... arrays) {

        int maxLengthArrayFromSet = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (maxLengthArrayFromSet < arrays[i].length) {
                maxLengthArrayFromSet = arrays[i].length;
            }
        }

        int[] sumMultipleArrays = new int[maxLengthArrayFromSet];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sumMultipleArrays[j] += arrays[i][j];
            }
        }
        System.out.println(Arrays.toString(sumMultipleArrays));
    }

    // * 7. Реализуйте метод, проверяющий, что есть “точка” в массиве,
    //   в которой сумма левой и правой части равны. “Точка находится между элементами”;
    //   Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    public static void hasBalancePoint(int[] arr) {

        int sumArrayElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArrayElements += arr[i];
        }

        if (sumArrayElements % 2 != 0) {
            System.out.println("Сумма элементов массива нечетная. У массива нет точки, в которой суммы левой и правой частей равны");
            return;
        }

        int sumElementsLeftPartArray = 0;
        int sumElementsRightPartArray = 0;
        int leftIndexBalancePoint = -1;
        for (int i = 0; i < arr.length; i++) {
            sumElementsLeftPartArray += arr[i];
            sumElementsRightPartArray = sumArrayElements - sumElementsLeftPartArray;
            if (sumElementsLeftPartArray == sumElementsRightPartArray) {
                leftIndexBalancePoint = i;
                break;
            }
        }

        if (leftIndexBalancePoint != -1) {
            System.out.println("Точка, в которой суммы левой и правой частей равны, находится между элементами " + arr[leftIndexBalancePoint] + " с индексом [" + leftIndexBalancePoint + "], и " + arr[leftIndexBalancePoint + 1] + " с индексом [" + (leftIndexBalancePoint + 1) + "]");
        } else {
            System.out.println("У массива нет точки, в которой суммы левой и правой частей равны");
        }
    }

    // * 8. Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания
    // или возрастания (по выбору пользователя)
    public static void hasArraySorted(int[] arr, int usersChoice) {

        boolean hasArraySortedDecreasing = true;
        boolean hasArraySortedIncreasing = true;
        if (usersChoice == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    hasArraySortedDecreasing = false;
                    break;
                }
            }
            if (hasArraySortedDecreasing) {
                System.out.println("Массив убывает");
            } else {
                System.out.println("Массив не убывает");
            }
        } else if (usersChoice == 2) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    hasArraySortedIncreasing = false;
                    break;
                }
            }
            if (hasArraySortedIncreasing) {
                System.out.println("Массив возрастает");
            } else {
                System.out.println("Массив не возрастает");
            }
        }
    }

    // * 9. Реализуйте метод, “переворачивающий” входящий массив
    // Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void reverseArray(int[] arr) {

        int tempForElements = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            tempForElements = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tempForElements;
        }
        System.out.println(Arrays.toString(arr));
    }
}
