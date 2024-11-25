package ru.ivakhramov.java.basic.homeworks.lesson26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public List<T> getFruits() {
        return fruits;
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        if (fruit == null) {
            throw new IllegalArgumentException("Фрукт не может быть null");
        }
        fruits.add(fruit);
    }

    public double weight() {
        double summWeight = 0;

        for (T fruit : fruits) {
            summWeight += fruit.getWeight();
        }
        return summWeight;
    }

    public boolean compare(Box<?> targetBox) {
        return Math.abs(this.weight() - targetBox.weight()) < 0.000001;
    }

    public void pourBoxToBox(Box<? super T> targetBox) {
        targetBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Фрукты пересыпаны");
    }
}
