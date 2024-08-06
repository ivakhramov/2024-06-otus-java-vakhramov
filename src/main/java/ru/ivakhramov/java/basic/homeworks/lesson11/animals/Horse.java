package ru.ivakhramov.java.basic.homeworks.lesson11.animals;

// 1. Создать классы Cat, Dog и Horse с наследованием от класса Animal
public class Horse extends Animal {

    // 3. Затраты выносливости:
    // Лошади на 1 метр плавания тратят 4 единицы
    public Horse (String name, float speedRun, float speedSwim) {
        super(name, speedRun, speedSwim);
        swimmingEnduranceCoef = 4;
    }
}
