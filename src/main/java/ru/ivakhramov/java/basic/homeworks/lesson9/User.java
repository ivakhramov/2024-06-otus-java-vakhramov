package ru.ivakhramov.java.basic.homeworks.lesson9;

// 1. Создать класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email
public class User {

    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 2. Реализовать у класса конструктор, позволяющий заполнять эти поля при создании объекта
    public User(String lastName, String firstName, String patronymic, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    // 3. Реализовать метод, выводящий в консоль информацию о пользователе в виде:
    // ФИО: фамилия имя отчество
    // Год рождения: год рождения
    // e-mail: email
    public void info() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("email: " + email + "\n");
    }
}
