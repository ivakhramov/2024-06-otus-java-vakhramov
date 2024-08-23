package ru.ivakhramov.java.basic.homeworks.lesson13.transport;

import ru.ivakhramov.java.basic.homeworks.lesson13.Human;
import ru.ivakhramov.java.basic.homeworks.lesson13.Terrain;

// 2. Реализовать классы Машина, Лошадь, Велосипед, Вездеход
public class Bike implements Transport {

    private final String type;
    private double energy;

    public Bike(Human human) {
        type = "Велосипед";
        this.energy = human.getEnergy();
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public String getType() {
        return type;
    }

    // 3. Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
    // 7. При перемещении Велосипед может использоваться без ограничений (можете для усложнения велосипедом тратить силы “водителя”).
    // При выполнении действия результат должен быть отпечатан в консоль
    // 8. У каждого вида транспорта есть местности по которым он не может перемещаться: лошадь и велосипед - болото
    // 9. При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие
    @Override
    public boolean canMove(double energy, double distance, Terrain terrain) {
        if (terrain.getType().equals("Болото")) {
            System.out.println(type + " не может перемещаться по " + terrain.getType());
            return false;
        }
        if (!enoughEnergy(energy, distance)) {
            System.out.println("Велосипедисту не хватит сил для перемещения на " + distance + " км");
            return false;
        }
        this.energy -= distance;
        System.out.println(type + " проехал " + distance + " км. по " + terrain.getType() + ". Текущее количество энергии " + this.energy + " у.е.");
        return true;
    }

    @Override
    public boolean enoughEnergy(double energy, double distance) {
        return (energy - distance > 0);
    }
}
