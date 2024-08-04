package ru.ivakhramov.java.basic.homeworks.lesson11;

import ru.ivakhramov.java.basic.homeworks.lesson11.animals.Cat;
import ru.ivakhramov.java.basic.homeworks.lesson11.animals.Dog;
import ru.ivakhramov.java.basic.homeworks.lesson11.animals.Horse;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 11.0f);
        Cat cat2 = new Cat("Barsik", 11.0f);
        Dog dog1 = new Dog("Bobik", 10.0f, 1.5f);
        Dog dog2 = new Dog("Sharik", 10.0f, 1.5f);
        Horse horse1 = new Horse("Burya", 15.0f, 1.0f);
        Horse horse2 = new Horse("Strela", 15.0f, 1.0f);

        cat1.run(96);
        cat1.info();
        cat1.run(12);
        cat1.info();
        cat1.run(4);
        cat1.info();
        cat2.swim(96);
        cat2.info();
        System.out.println("----------");

        dog1.run(96);
        dog1.info();
        dog1.run(12);
        dog1.info();
        dog1.run(4);
        dog1.info();
        dog2.swim(48);
        dog2.info();
        dog2.swim(6);
        dog2.info();
        dog2.swim(2);
        dog2.info();
        System.out.println("----------");

        horse1.run(96);
        horse1.info();
        horse1.run(12);
        horse1.info();
        horse1.run(4);
        horse1.info();
        horse2.swim(24);
        horse2.info();
        horse2.swim(3);
        horse2.info();
        horse2.swim(1);
        horse2.info();
    }
}
