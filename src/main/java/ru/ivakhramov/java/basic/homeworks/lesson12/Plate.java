package ru.ivakhramov.java.basic.homeworks.lesson12;

// 1. Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды)
// и Кот (имя, аппетит). Количество еды измеряем в условных единицах.
public class Plate {
    private final int maxFood;
    private int food;

    // 2. При создании тарелки указывается ее объем и она полностью заполняется едой
    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.food = maxFood;
    }

    // 3. В тарелке должен быть метод, позволяющий добавить еду в тарелку.
    // После добавления в тарелке не может оказаться еды больше максимума
    public void addFood(int food) {
        if (food <= 0) {
            return;
        }
        if ((this.food + food) >= maxFood ) {
            this.food = maxFood;
            return;
        }
        this.food += food;
    }

    // 4. В тарелке должен быть boolean метод уменьшения количества еды,
    // при этом после такого уменьшения, в тарелке не может оказаться отрицательное количество еды
    // (если удалось уменьшить еду так, чтобы в тарелке осталось >= 0 кусков еды,
    // то возвращаем true, в противном случае - false).
    public boolean reduceFood(int food) {
        if (food <= 0 || this.food - food < 0) {
            return false;
        }
        this.food -= food;
        return true;
    }

    public void info() {
        System.out.println("Вместимость тарелки: " + maxFood + " , текущее количество еды на тарелке: " + food);
    }
}
