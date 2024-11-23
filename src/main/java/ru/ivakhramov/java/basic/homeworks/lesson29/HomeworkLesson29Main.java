package ru.ivakhramov.java.basic.homeworks.lesson29;

import java.util.Arrays;

public class HomeworkLesson29Main {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(ArrayUtilities.getElementsArrayFollowingLastOne(new int[]{1, 2, 1, 2, 2})));
            System.out.println(Arrays.toString(ArrayUtilities.getElementsArrayFollowingLastOne(new int[]{2, 2, 2, 2})));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println(ArrayUtilities.checkArrayForOneAndTwo(new int[]{1, 2}));
        System.out.println(ArrayUtilities.checkArrayForOneAndTwo(new int[]{1, 1}));
        System.out.println(ArrayUtilities.checkArrayForOneAndTwo(new int[]{1, 3}));
        System.out.println(ArrayUtilities.checkArrayForOneAndTwo(new int[]{1, 2, 2, 1}));
    }
}
