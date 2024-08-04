package ru.ivakhramov.java.basic.homeworks.lesson11.animals;

// 1. Создать классы Cat, Dog и Horse с наследованием от класса Animal
public abstract class Animal {
    // 2. У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
    String name;
    float speedRun;
    float speedSwim;
    int endurance;

    public Animal (String name, float speedRun) {
        this.name = name;
        this.speedRun = speedRun;
        endurance = 100;
    }

    public Animal (String name, float speedRun, float speedSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        endurance = 100;
    }

    // 4. Реализовать методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
    // указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем
    // время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем
    // сообщения в консоль
    public float run(int distance) {
        // 3. Затраты выносливости: все животные на 1 метр бега тратят 1 ед выносливости
        if (endurance == 0) {
            System.out.println("У " + name + " состояние усталости, он не может бежать\n");
            return -1;
        }
        endurance -= distance;
        if(endurance < 0) {
            System.out.println(name + " пробежал только " +  (distance + endurance) + " метра(ов). После этого у него появилось состояние усталости, и он остановился\n");
            endurance = 0;
            return -1;
        }
        System.out.println(name + " пробежал " + distance + " метра(ов) за " + distance / speedRun + " секунд. Текущая выносливость " + name + " " + endurance + " единиц(ы)\n");
        return distance / speedRun;
    }

    // 3. Затраты выносливости:
    // Собаки на 1 метр плавания - 2 ед.
    // Лошади на 1 метр плавания тратят 4 единицы
    // Кот плавать не умеет
    public abstract float swim(int distance);

    // 5. Добавить метод info(), который выводит в консоль состояние животного
    public void info() {
        if (endurance <= 0) {
            System.out.println("У " + name + " появилось состояние усталости\n");
            return;
        }
        System.out.println("Текущая выносливость " + name + " " + endurance + " единиц(ы)\n");
    }


}
