package ru.ivakhramov.java.basic.homeworks.lesson14;

public class Main {

    public static void main(String[] args) {

        String[][] stringsForTest1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] stringsForTest2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] stringsForTest3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4", "5", "6"},
                {"1", "2", "3", "4", "5"}
        };
        String[][] stringsForTest4 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] stringsForTest5 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "два", "три", "4"},
                {"1", "2", "3", "4"}
        };

        // 3. В методе main() необходимо вызвать полученный метод,
        // обработать возможные исключения AppArraySizeException и AppArrayDataException и вывести результат расчета
        // (сумму элементов, при условии, что подали на вход корректный массив).
        try {
            System.out.println("Сумма элементов массива равна " + sumArray(stringsForTest1));
        } catch (AppArraySizeException | AppArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumArray(stringsForTest2));
        } catch (AppArraySizeException | AppArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumArray(stringsForTest3));
        } catch (AppArraySizeException | AppArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumArray(stringsForTest4));
        } catch (AppArraySizeException | AppArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + sumArray(stringsForTest5));
        } catch (AppArraySizeException | AppArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }

    // 1. Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
    // Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
    public static int sumArray(String[][] strings) {

        if (strings.length != 4) {
            throw new AppArraySizeException("Размерность массива отличается от 4 х 4");
        }
        for (int i = 0; strings.length > i; i++) {
            if (strings[i].length != 4) {
                throw new AppArraySizeException("Размерность массива отличается от 4 х 4");
            }
        }

        // 2. Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
        // должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        // * Для преобразования строки к числу используйте статический метод класса Integer: Integer.parseInt(сюда_подать_строку);
        // * Если Java не сможет преобразовать входную строку (в строке число криво написано), то будет сгенерировано исключение NumberFormatException.
        int sum = 0;
        for (int i = 0; strings.length > i; i++) {
            for (int j = 0; strings[i].length > j; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException exception) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
