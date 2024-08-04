package ru.ivakhramov.java.basic.homeworks.lesson11.animals;

// 1. Создать классы Cat, Dog и Horse с наследованием от класса Animal
public class Horse extends Animal {

    public Horse (String name, float speedRun, float speedSwim) {
        super(name, speedRun, speedSwim);
    }

    @Override
    // 4. Реализовать методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
    // указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем
    // время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем
    // сообщения в консоль
    public float swim(int distance) {
        // 3. Затраты выносливости: Лошади на 1 метр плавания тратят 4 единицы
        if (endurance == 0) {
            System.out.println("У " + name + " состояние усталости, он не может плыть\n");
            return -1;
        }
        endurance -= (distance * 4);
        if (endurance < 0) {
            System.out.println(name + " проплыл только " + (distance + endurance / 4) + " метра(ов). После этого у него появилось состояние усталости, он перестал плыть, и его вынесло течением на берег\n");
            endurance = 0;
            return -1;
        }
        System.out.println(name + " проплыл " + distance + " метра(ов) за " + distance / speedSwim + " секунд. Текущая выносливость " + name + " " + endurance + " единиц(ы)\n");
        return distance / speedSwim;
    }
}
