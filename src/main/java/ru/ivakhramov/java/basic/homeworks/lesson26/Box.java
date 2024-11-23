package ru.ivakhramov.java.basic.homeworks.lesson26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

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

    public void pourBoxToBox(Box<T> targetBox) {
        if (!targetBox.fruits.isEmpty()) {
            System.out.println("Коробка уже занята. Возьмите другую коробку");
            return;
        }

        if(!(targetBox instanceof Box<?> &&
                (targetBox.fruits.isEmpty() || targetBox.fruits.get(0) instanceof Fruit))) {
            System.out.println("коробка должна быть для фруктов");
            return;
        }

        targetBox.fruits.addAll(this.fruits);
        this.fruits.clear();
        System.out.println("Фрукты пересыпаны");
    }
}
