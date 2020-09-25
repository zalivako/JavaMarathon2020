package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1990);
        car1.setColor("красный");
        car1.setModel("монтана");

        System.out.println("Год выпуска: " + car1.getYear());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());
    }
}
