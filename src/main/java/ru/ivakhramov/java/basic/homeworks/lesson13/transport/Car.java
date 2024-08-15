package ru.ivakhramov.java.basic.homeworks.lesson13.transport;

import ru.ivakhramov.java.basic.homeworks.lesson13.terrain.Terrain;

// 2. Реализовать классы Машина, Лошадь, Велосипед, Вездеход
public class Car implements Transport {

    private final String type;
    private double gas;
    private double consumptionCoef;

    public Car(double gas, double consumptionCoef) {
        type = "Машина";
        this.gas = gas;
        this.consumptionCoef = consumptionCoef;
    }

    @Override
    public double getEnergy() {
        return gas;
    }

    @Override
    public String getType() {
        return type;
    }

    // 3. Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
    // 7. При перемещении Машина и Вездеход тратят бензин, который у них ограничен.
    // При выполнении действия результат должен быть отпечатан в консоль
    // 9. При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие
    @Override
    public boolean canMove(double energy, double distance, Terrain terrain) {
        if (!terrain.canMove(this)) {
            System.out.println(type + " не может перемещаться по " + terrain.getType());
            return false;
        }
        if (!enoughEnergy(energy, distance)) {
            System.out.println("Не хватает " + ((distance * consumptionCoef) - energy) + " л. бензина для перемещения на " + distance + " км");
            return false;
        }
        gas -= (distance * consumptionCoef);
        System.out.println(type + " проехала " + distance + " км. по " + terrain.getType() + ". Текущее количество топлива " + gas + " л.");
        return true;
    }

    @Override
    public boolean enoughEnergy(double energy, double distance) {
        return (energy - (distance * consumptionCoef) > 0);
    }
}
