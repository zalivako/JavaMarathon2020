package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1990);
        car1.info();
        System.out.println(car1.yearDifference(2020));

        Motorbike motorbike1 = new Motorbike("ява", "черный", 1980);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2020));
    }
}
