package ru.ivakhramov.java.basic.homeworks.lesson26;

public class HomeworkLesson26Main {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(2.5));
        appleBox.addFruit(new Apple(7.5));

        Box<Apple> appleBoxEmpty = new Box<>();

        Box<Apple> appleBoxFilled = new Box<>();
        appleBoxFilled.addFruit(new Apple(2.5));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5));
        orangeBox.addFruit(new Orange(3.5));

        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        System.out.println("Вес коробки с яблоками: " + orangeBox.weight());
        System.out.println();

        if (appleBox.compare(orangeBox)) {
            System.out.println("Вес коробок равен");
        } else {
            System.out.println("Вес коробок не равен");
        }
        System.out.println();

        System.out.println("Вес коробки с яблоками 1: " + appleBox.weight());
        System.out.println("Вес коробки с яблоками 3: " + appleBoxFilled.weight());
        appleBox.pourBoxToBox(appleBoxFilled);
        System.out.println("Вес коробки с яблоками 1: " + appleBox.weight());
        System.out.println("Вес коробки с яблоками 3: " + appleBoxFilled.weight());
        System.out.println();

        System.out.println("Вес коробки с яблоками 1: " + appleBox.weight());
        System.out.println("Вес коробки с яблоками 2: " + appleBoxEmpty.weight());
        appleBox.pourBoxToBox(appleBoxEmpty);
        System.out.println("Вес коробки с яблоками 1: " + appleBox.weight());
        System.out.println("Вес коробки с яблоками 2: " + appleBoxEmpty.weight());


    }
}
