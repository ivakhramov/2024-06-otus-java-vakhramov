package ru.ivakhramov.java.basic.homeworks.lesson14;

public class AppArrayDataException extends RuntimeException {

    // 2. Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
    // должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    public AppArrayDataException(int i, int j) {

        super("Элемент, находящийся в ячейке [" + i + "][" + j + "] невозможно преобразовать из строки в число");
    }
}
