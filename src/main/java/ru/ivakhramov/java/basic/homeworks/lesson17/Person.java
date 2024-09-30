package ru.ivakhramov.java.basic.homeworks.lesson17;

// Даны класс Person и enum Position
public class Person {
    private String name;
    private Position position;
    private Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + position + ", " + id + "}";
    }
}