package ru.ivakhramov.java.basic.homeworks.lesson13;

import ru.ivakhramov.java.basic.homeworks.lesson13.transport.*;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Василий", 20);

        Transport atv = new ATV(80, 0.3);
        Transport bike = new Bike(human);
        Transport car = new Car(40, 0.08);
        Transport horse = new Horse(50);

        human.move(100, Terrain.FOREST);
        human.useTransport(atv);
        human.move(100, Terrain.FOREST);
        human.move(1000, Terrain.FOREST);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.PLAIN);
        human.useTransport(atv);
        human.move(100, Terrain.PLAIN);
        human.move(1000, Terrain.PLAIN);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.SWAMP);
        human.useTransport(atv);
        human.move(10, Terrain.SWAMP);
        human.move(100, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.move(10, Terrain.FOREST);
        human.useTransport(bike);
        human.move(5, Terrain.FOREST);
        human.move(100, Terrain.FOREST);
        human.leaveTransport();
        System.out.println();
        human.move(10, Terrain.PLAIN);
        human.useTransport(bike);
        human.move(5, Terrain.PLAIN);
        human.move(100, Terrain.PLAIN);
        human.leaveTransport();
        System.out.println();
        human.move(10, Terrain.SWAMP);
        human.useTransport(bike);
        human.move(5, Terrain.SWAMP);
        human.move(100, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.move(100, Terrain.FOREST);
        human.useTransport(car);
        human.move(100, Terrain.FOREST);
        human.move(1000, Terrain.FOREST);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.PLAIN);
        human.useTransport(car);
        human.move(100, Terrain.PLAIN);
        human.move(1000, Terrain.PLAIN);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.SWAMP);
        human.useTransport(car);
        human.move(100, Terrain.SWAMP);
        human.move(1000, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();

        human.move(100, Terrain.FOREST);
        human.useTransport(horse);
        human.move(10, Terrain.FOREST);
        human.move(100, Terrain.FOREST);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.PLAIN);
        human.useTransport(horse);
        human.move(10, Terrain.PLAIN);
        human.move(100, Terrain.PLAIN);
        human.leaveTransport();
        System.out.println();
        human.move(100, Terrain.SWAMP);
        human.useTransport(horse);
        human.move(10, Terrain.SWAMP);
        human.move(100, Terrain.SWAMP);
        human.leaveTransport();
        System.out.println();
    }
}
