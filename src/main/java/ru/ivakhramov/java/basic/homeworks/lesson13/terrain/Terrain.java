package ru.ivakhramov.java.basic.homeworks.lesson13.terrain;

import ru.ivakhramov.java.basic.homeworks.lesson13.transport.Transport;

public interface Terrain {

    boolean canMove(Transport transport);

    String getType();
}
