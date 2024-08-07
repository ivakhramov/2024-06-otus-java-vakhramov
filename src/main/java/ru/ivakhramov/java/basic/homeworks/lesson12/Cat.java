package ru.ivakhramov.java.basic.homeworks.lesson12;

// 1. Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды)
// и Кот (имя, аппетит). Количество еды измеряем в условных единицах.
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    // 5. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    // 6. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    public void feed(boolean isEnoughFood) {
        if (!isEnoughFood) {
            return;
        }
        satiety = true;
    }

    public void info() {
        System.out.println("Кот " + name + " может съесть за раз " + appetite + ", в настоящее время " + (satiety ? "сыт" : "голоден"));
    }
}
