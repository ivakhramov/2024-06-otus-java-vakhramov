package ru.ivakhramov.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkLesson15Main {

    public static void main(String[] args) {

        System.out.println(generateRangeNum(3, 7));                                           // [3, 4, 5, 6, 7]
        System.out.println(generateRangeNum(7, 3));                                           // []

        List<Integer> testList1 = new ArrayList<>(Arrays.asList(0, 5, 6, -3, 2, 7));
        System.out.println(sumNumsGreaterFive(testList1));                                    // 13

        List<Integer> testList2 = new ArrayList<>(Arrays.asList(0, 5, 6, -3, 2, 7));
        overwriteList(5, testList2);
        System.out.println(testList2);                                                        // [5, 5, 5, 5, 5, 5]

        List<Integer> testList3 = new ArrayList<>(Arrays.asList(0, 5, 6, -3, 2, 7));
        increaseNumsListByDelta(5, testList3);
        System.out.println(testList3);                                                        // [5, 10, 11, 2, 7, 12]

        List<Employee> testList4 = new ArrayList<>(Arrays.asList(
                new Employee("Иван", 33),
                new Employee("Василий", 27),
                new Employee("Петр", 19),
                new Employee("Алексей", 74)
        ));
        System.out.println(getNames(testList4));                                              // [Иван, Василий, Петр, Алексей]

        System.out.println(getEmployeesMoreMinAge(testList4, 30));                     // [[Иван, 33], [Алексей, 74]]

        System.out.println(checkMinAverageAgeEmployees(testList4, 38f));         // true
        System.out.println(checkMinAverageAgeEmployees(testList4, 38.25f));      // false
        System.out.println(checkMinAverageAgeEmployees(testList4, 39f));         // false

        System.out.println(getYoungestEmployee(testList4));                                   // [Петр, 19]
    }

    // 1. Реализуйте метод, принимающий в качестве аргументов числа min и max,
    // и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1)
    public static List<Integer> generateRangeNum(int min, int max) {

        List<Integer> rangeNums = new ArrayList<>();


        for (int i = min; i <= max; i++) {
            rangeNums.add(i);
        }
        return rangeNums;
    }

    // 2. Реализуйте метод, принимающий в качестве аргумента список целых чисел,
    // суммирующий все элементы, значение которых больше 5, и возвращающий сумму
    public static int sumNumsGreaterFive(List<Integer> list) {

        int sumNums = 0;

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sumNums += list.get(i);
            }
        }
        return sumNums;
    }

    // 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    // метод должен переписать каждую заполненную ячейку списка указанным числом
    public static void overwriteList(int number, List<Integer> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    // 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    // увеличивающий каждый элемент списка на указанное число
    public static void increaseNumsListByDelta(int delta, List<Integer> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + delta));
        }
    }

    // 6. Реализуйте метод, принимающий в качестве аргумента список сотрудников,
    // и возвращающий список их имен
    public static List<String> getNames(List<Employee> list) {

        List<String> listNames = new ArrayList<>();

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        for (int i = 0; i < list.size(); i++) {
            listNames.add(list.get(i).getName());
        }
        return listNames;
    }

    // 7. Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    // и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу
    public static List<Employee> getEmployeesMoreMinAge(List<Employee> list, int minAge) {

        List<Employee> employeesMoreMinAge = new ArrayList<>();

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= minAge) {
                employeesMoreMinAge.add(list.get(i));
            }
        }
        return employeesMoreMinAge;
    }

    // 8. Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
    // и проверяющий, что средний возраст сотрудников превышает указанный аргумент
    public static boolean checkMinAverageAgeEmployees(List<Employee> list, float minAverageAge) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        int sumMinAgeEmployees = 0;
        for (int i = 0; i < list.size(); i++) {
            sumMinAgeEmployees += list.get(i).getAge();
        }
        float minAverageAgeEmployees = (float) sumMinAgeEmployees / list.size();

        if (minAverageAgeEmployees > minAverageAge) {
            return true;
        } else {
            return false;
        }
    }

    // 9. Реализуйте метод, принимающий в качестве аргумента список сотрудников,
    // и возвращающий ссылку на самого молодого сотрудника
    public static Employee getYoungestEmployee(List<Employee> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Лист не должен быть пустым");
        }

        Employee youngestEmployee = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (youngestEmployee.getAge() > list.get(i).getAge()) {
                youngestEmployee = list.get(i);
            }
        }
        return youngestEmployee; // Мне не нравится условие. По нему нужно возвращать ссылку на сотрудника,
                                 // а их может быть несколько одного возраста. Лучше было бы возвращать список.
                                 // Но реализовал, как написано
    }
}
