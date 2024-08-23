package ru.ivakhramov.java.basic.homeworks.lesson13;

// 4. В приложении должны быть типы местности: густой лес, равнина, болото
public enum Terrain {

    FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private final String type;

    Terrain(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}