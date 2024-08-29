package ru.ivakhramov.java.basic.homeworks.lesson14;

public class AppArraySizeException extends RuntimeException {

    // 1. Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
    // Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
    public AppArraySizeException(String message) {

        super(message);
    }
}
