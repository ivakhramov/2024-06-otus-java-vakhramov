package ru.ivakhramov.java.basic.homeworks.lesson15;

// 5. Создайте класс Сотрудник с полями: имя, возраст
public class Employee {

    private final String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAge() + "]";
    }
}
