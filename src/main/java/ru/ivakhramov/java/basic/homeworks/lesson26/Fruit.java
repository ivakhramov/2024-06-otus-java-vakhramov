package ru.ivakhramov.java.basic.homeworks.lesson26;

abstract class Fruit {

    private double weight;

    public double getWeight() {

        return weight;
    }

    public Fruit(double weight) {

        if (weight <= 0) {
            throw new IllegalArgumentException("Вес фрукта не может быть отрицательным");
        }

        this.weight = weight;
    }
}
