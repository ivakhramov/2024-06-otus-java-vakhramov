package ru.ivakhramov.java.basic.homeworks.lesson26;

public class HomeworkLesson26Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(2.5));
        appleBox.addFruit(new Apple(7.5));

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

        Box<Fruit> fruitBox1 = new Box<>();
        Box<Fruit> fruitBox2 = new Box<>();
        fruitBox1.addFruit(new Apple(5.5));
        fruitBox1.pourBoxToBox(fruitBox2);
        System.out.println();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        appleBox1.addFruit(new Apple(5.5));
        appleBox1.pourBoxToBox(appleBox2);
        System.out.println();

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox1.addFruit(new Orange(5.5));
        orangeBox1.pourBoxToBox(orangeBox2);
        System.out.println();

        Box<Orange> orangeBox3 = new Box<>();
        Box<Fruit> fruitBox3 = new Box<>();
        orangeBox3.addFruit(new Orange(5.5));
        orangeBox3.pourBoxToBox(fruitBox3);
        System.out.println();

        Box<Apple> appleBox3 = new Box<>();
        Box<Fruit> fruitBox4 = new Box<>();
        appleBox3.addFruit(new Apple(5.5));
        appleBox3.pourBoxToBox(fruitBox4);
        System.out.println();

        Box<Fruit> fruitBox5 = new Box<>();
        Box<Apple> appleBox4 = new Box<>();
        fruitBox5.addFruit(new Apple(5.5));
        fruitBox5.pourBoxToBox(appleBox4);
        System.out.println();

        Box<Fruit> fruitBox6 = new Box<>();
        Box<Orange> orangeBox4 = new Box<>();
        fruitBox6.addFruit(new Orange(5.5));
        fruitBox6.pourBoxToBox(orangeBox4);
        System.out.println();

        Box<Orange> orangeBox5 = new Box<>();
        Box<Apple> appleBox5 = new Box<>();
        orangeBox5.addFruit(new Orange(5.5));
        orangeBox5.pourBoxToBox(appleBox5);
        System.out.println();

        Box<Apple> appleBox6 = new Box<>();
        Box<Orange> orangeBox6 = new Box<>();
        appleBox6.addFruit(new Apple(5.5));
        appleBox6.pourBoxToBox(orangeBox6);
        System.out.println();
    }
}
