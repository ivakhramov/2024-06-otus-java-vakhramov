package ru.ivakhramov.java.basic.homeworks.lesson12;

public class Main {

    public static void main(String[] args) {

        // 7. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        // и потом вывести информацию о сытости котов в консоль.
        Cat[] cats = {
                new Cat("Василий", 50),
                new Cat("Мурзик", 25),
                new Cat("Барсик", 20),
                new Cat("Пушок", 20),
                new Cat("Снежок", 10)
        };

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            plate.info();
            cats[i].feed(plate);
            cats[i].info();
            plate.info();
            System.out.println();
        }

        plate.addFood(10);
        plate.info();
        System.out.println();

        plate.addFood(1000);
        plate.info();

        plate.addFood(-1000);
        plate.info();
        plate.reduceFood(50);
        plate.info();
        plate.reduceFood(-1000);
        plate.info();
    }
}
