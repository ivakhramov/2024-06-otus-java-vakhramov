package ru.ivakhramov.java.basic.homeworks.lesson16;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1. Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров
public class PhoneBook {

    // 4. Под одним именем может быть несколько телефонов
    // (в случае однофамильцев, или наличии у одного человека нескольких номеров),
    // тогда при запросе такой фамилии должны выводиться все телефоны
    private Map<String, List<String>> phoneBook;

    PhoneBook() {
        phoneBook = new HashMap<>();
    }

    @Override
    public String toString() {
        return phoneBook.toString();
    }

    // 2. Метод add() должен позволять добавлять запись имя-телефон
    public void add(String name, String phoneNumber) {

        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }

    // 3. Метод find() выполнять поиск номер(-а, -ов) телефона по имени
    public List<String> find(String name) {

        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    // 5. Метод containsPhoneNumber должен проверять наличие телефона в справочнике
    public boolean containsPhoneNumber(String phoneNumber) {

        boolean result = false;
        for (List<String> phoneNumbers : phoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
