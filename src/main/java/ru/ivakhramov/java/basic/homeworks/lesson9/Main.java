package ru.ivakhramov.java.basic.homeworks.lesson9;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

// 4. В методе main() Main класса создать массив из 10 пользователей и заполнить его объектами
// и с помощью цикла вывести информацию только о пользователях старше 40 лет
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1984, "iivanov@gmail.com"),
                new User("Смирнов", "Смирн", "Смирнович", 2000, "ssmirnov@gmail.com"),
                new User("Кузнецов", "Кузнец", "Кузнецович", 1980, "kkuznetcov@gmail.com"),
                new User("Попов", "Поп", "Попович", 1960, "ppopov@gmail.com"),
                new User("Васильев", "Василий", "Васильевич", 1940, "vvasiliev@gmail.com"),
                new User("Петров", "Петр", "Петрович", 1950, "ppetrov@gmail.com"),
                new User("Соколов", "Сокол", "Соколович", 1970, "ssokolov@gmail.com"),
                new User("Михайлов", "Михаил", "Михайлович", 1990, "mmikhailov@gmail.com"),
                new User("Новиков", "Новик", "Новикович", 2010, "nnovikov@gmail.com"),
                new User("Федоров", "Федор", "Федорович", 1983, "ffedorov@gmail.com"),
        };

        for (int i = 0; i < users.length; i++) {
            if (LocalDate.now().getYear() - users[i].getYearOfBirth() > 40) {
                users[i].info();
            }
        }

// 5. Проверка класса Box
        Box box1 = new Box(10, 10, 10, "Зеленая");
        box1.info();
        box1.close();
        box1.info();
        box1.put("Мяч");
        box1.info();
        box1.open();
        box1.info();
        box1.put("Мяч");
        box1.info();
        box1.close();
        box1.info();
        box1.get();
        box1.info();
        box1.open();
        box1.info();
        box1.get();
        box1.info();
        box1.repaint("Желтый");
        box1.info();

    }
}
