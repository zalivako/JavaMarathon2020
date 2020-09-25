package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(1980, "черный", "ява");

        System.out.println("Год выпуска: " + motorbike1.getYear());
        System.out.println("Цвет мотоцикла: " + motorbike1.getColor());
        System.out.println("Модель: " + motorbike1.getModel());
    }
}
