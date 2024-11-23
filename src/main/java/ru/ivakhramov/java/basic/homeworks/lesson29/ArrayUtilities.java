package ru.ivakhramov.java.basic.homeworks.lesson29;

public class ArrayUtilities {
    public static int[] getElementsArrayFollowingLastOne(int[] array) {
        int lastOneIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                lastOneIndex = i;
            }
        }

        if (lastOneIndex == -1) {
            throw new RuntimeException("В массиве нет единиц");
        }

        int newArrayLength = array.length - lastOneIndex - 1;
        int[] newArray = new int[newArrayLength];

        if (newArrayLength <= 0) {
            newArray = null;
        } else {
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = array[lastOneIndex + i + 1];
            }
        }
        return newArray;
    }

    public static boolean checkArrayForOneAndTwo(int[] array) {
        boolean hasOne = false;
        boolean hasTwo = false;

        for (int number : array) {
            if (number == 1) {
                hasOne = true;
            } else if (number == 2) {
                hasTwo = true;
            } else {
                return false;
            }
        }
        return hasOne && hasTwo;
    }
}
