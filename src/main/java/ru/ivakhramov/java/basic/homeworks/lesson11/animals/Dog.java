package ru.ivakhramov.java.basic.homeworks.lesson11.animals;

// 1. Создать классы Cat, Dog и Horse с наследованием от класса Animal
public class Dog extends Animal {

    // 3. Затраты выносливости:
    // Собаки на 1 метр плавания - 2 ед.
    public Dog(String name, float speedRun, float speedSwim) {
        super(name, speedRun, speedSwim);
        swimmingEnduranceCoef = 2;
    }
}

