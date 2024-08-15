package ru.ivakhramov.java.basic.homeworks.lesson13;

import ru.ivakhramov.java.basic.homeworks.lesson13.terrain.Terrain;
import ru.ivakhramov.java.basic.homeworks.lesson13.transport.Transport;

// 1. Создать класс Человек с полями name (имя) и currentTransport (текущий транспорт)
public class Human {

    private String name;
    private Transport currentTransport;
    private double energy;

    public Human(String name, double energy) {
        this.name = name;
        currentTransport = null;
        this.energy = energy;
    }

    public double getEnergy() {
        return energy;
    }

    // 5. Человек должен иметь возможность сесть на любой из этих видов транспорта,
    // встать с него,
    // или переместиться на некоторое расстояние (при условии что он находится на каком-либо транспорте)
    public void useTransport(Transport transport) {
        currentTransport = transport;
        System.out.println(name + " сел в/на " + currentTransport.getType());
    }

    public void leaveTransport() {
        System.out.println(name + " покинул " + currentTransport.getType());
        currentTransport = null;
    }

    // 6. При попытке выполнить перемещение у человека, не использующего транспорт, считаем что он просто идет указанное расстояние пешком
    public void move(float distance, Terrain terrain) {
        if (currentTransport != null) {
            currentTransport.canMove(currentTransport.getEnergy(), distance, terrain);
            return;
        }
        System.out.println(name + " идет пешком " + distance + " км по " + terrain.getType());
    }
}
