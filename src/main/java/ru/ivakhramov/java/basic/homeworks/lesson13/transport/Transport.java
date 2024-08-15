package ru.ivakhramov.java.basic.homeworks.lesson13.transport;

import ru.ivakhramov.java.basic.homeworks.lesson13.terrain.Terrain;

public interface Transport {

    boolean canMove(double energy, double distance, Terrain terrain);

    boolean enoughEnergy(double energy, double distance);

    double getEnergy();

    String getType();
}
