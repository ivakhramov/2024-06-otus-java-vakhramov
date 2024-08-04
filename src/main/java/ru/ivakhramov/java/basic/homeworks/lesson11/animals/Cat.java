package ru.ivakhramov.java.basic.homeworks.lesson11.animals;

// 1. Создать классы Cat, Dog и Horse с наследованием от класса Animal
public class Cat extends Animal {

    public Cat (String name, float speedRun) {
        super(name, speedRun);
    }

    @Override
    // 4. Реализовать методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
    // указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем
    // время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем
    // сообщения в консоль
    public float swim(int distance) {
        // 3. Затраты выносливости: Кот плавать не умеет.
        System.out.println("Коты плавать не умеют\n");
        return -1;
    }
}
