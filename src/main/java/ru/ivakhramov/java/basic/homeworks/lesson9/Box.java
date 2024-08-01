package ru.ivakhramov.java.basic.homeworks.lesson9;

// 5. Реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
// Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после
// создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно
// складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
// только при условии, что коробка открыта (предметом читаем просто строку). Выполнение методов должно
// сопровождаться выводом сообщений в консоль.
public class Box {

    private final float width;
    private final float height;
    private final float length;
    private String color;
    private boolean isOpen;
    private boolean isFilled;
    private String item;

    public Box(float width, float height, float length, String color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.color = color;
        isOpen = true;
        isFilled = false;
        item = null;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
        }
        System.out.println("Коробка открыта\n");
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
        }
        System.out.println("Коробка закрыта\n");
    }

    public void repaint(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + this.color + " цвет\n");
    }

    public void info() {
        System.out.println("Размеры коробки (Ширина х Высота х Длина): " + width + " x " + height + " x " + length);
        System.out.println("Цвет коробки: " + color);
        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (isFilled) {
            System.out.println("В коробке находится " + item + "\n");
        } else {
            System.out.println("Коробка пустая\n");
        }
    }

    public void put(String item) {
        if (!isOpen) {
            System.out.println("Коробка закрыта. Что-бы положить предмет, сначала откройте коробку\n");
            return;
        }
        if (isFilled) {
            System.out.println("Коробка заполнена. Что-бы положить предмет, сначала освободите коробку\n");
            return;
        }
        isFilled = true;
        this.item = item;
        System.out.println(this.item + " положен в коробку\n");
    }

    public void get() {
        if (!isOpen) {
            System.out.println("Коробка закрыта. Что-бы выложить предмет, сначала откройте коробку\n");
            return;
        }
        if (!isFilled) {
            System.out.println("Коробка пустая. Что-бы выложить предмет, сначала положите его коробку\n");
            return;
        }
        isFilled = false;
        System.out.println(item + " выложен из коробки\n");
        item = null;
    }
}
