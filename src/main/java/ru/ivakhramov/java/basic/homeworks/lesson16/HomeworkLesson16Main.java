package ru.ivakhramov.java.basic.homeworks.lesson16;

public class HomeworkLesson16Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван Иванович", "+7 911 111-11-11");
        phoneBook.add("Иванов Петр Петрович", "+7 911 111-11-12");
        phoneBook.add("Петров Петр Петрович", "+7 911 111-11-13");
        phoneBook.add("Петров Петр Петрович", "+7 911 111-11-14");
        System.out.println(phoneBook); // Иванов Петр Петрович=[+7 911 111-11-12],
                                       // Петров Петр Петрович=[+7 911 111-11-13, +7 911 111-11-14],
                                       // Иванов Иван Иванович=[+7 911 111-11-11]

        System.out.println(phoneBook.find("Иванов Иван Иванович")); // [+7 911 111-11-11]
        System.out.println(phoneBook.find("Петров Петр Петрович")); // [+7 911 111-11-13, +7 911 111-11-14]

        System.out.println(phoneBook.containsPhoneNumber("+7 911 111-11-14")); // true
        System.out.println(phoneBook.containsPhoneNumber("+7 911 111-11-15")); // false
    }
}
