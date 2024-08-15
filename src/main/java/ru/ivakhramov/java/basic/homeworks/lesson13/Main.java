package ru.ivakhramov.java.basic.homeworks.lesson13;

import ru.ivakhramov.java.basic.homeworks.lesson13.terrain.*;
import ru.ivakhramov.java.basic.homeworks.lesson13.transport.*;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Василий", 20);
        Terrain forest = new Forest();
        Terrain plain = new Plain();
        Terrain swamp = new Swamp();
        Transport atv = new ATV(80, 0.3);
        Transport bike = new Bike(human);
        Transport car = new Car(40, 0.08);
        Transport horse = new Horse(50);

        human.move(100, forest);
        human.useTransport(atv);
        human.move(100, forest);
        human.move(1000, forest);
        human.leaveTransport();
        System.out.println();
        human.move(100, plain);
        human.useTransport(atv);
        human.move(100, plain);
        human.move(1000, plain);
        human.leaveTransport();
        System.out.println();
        human.move(100, swamp);
        human.useTransport(atv);
        human.move(10, swamp);
        human.move(100, swamp);
        human.leaveTransport();
        System.out.println();

        human.move(10, forest);
        human.useTransport(bike);
        human.move(5, forest);
        human.move(100, forest);
        human.leaveTransport();
        System.out.println();
        human.move(10, plain);
        human.useTransport(bike);
        human.move(5, plain);
        human.move(100, plain);
        human.leaveTransport();
        System.out.println();
        human.move(10, swamp);
        human.useTransport(bike);
        human.move(5, swamp);
        human.move(100, swamp);
        human.leaveTransport();
        System.out.println();

        human.move(100, forest);
        human.useTransport(car);
        human.move(100, forest);
        human.move(1000, forest);
        human.leaveTransport();
        System.out.println();
        human.move(100, plain);
        human.useTransport(car);
        human.move(100, plain);
        human.move(1000, plain);
        human.leaveTransport();
        System.out.println();
        human.move(100, swamp);
        human.useTransport(car);
        human.move(100, swamp);
        human.move(1000, swamp);
        human.leaveTransport();
        System.out.println();

        human.move(100, forest);
        human.useTransport(horse);
        human.move(10, forest);
        human.move(100, forest);
        human.leaveTransport();
        System.out.println();
        human.move(100, plain);
        human.useTransport(horse);
        human.move(10, plain);
        human.move(100, plain);
        human.leaveTransport();
        System.out.println();
        human.move(100, swamp);
        human.useTransport(horse);
        human.move(10, swamp);
        human.move(100, swamp);
        human.leaveTransport();
        System.out.println();
    }
}
