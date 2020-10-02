package day11;

public class Task1 {
    public static void main(String[] args) {
        // warehouse1
        Warehouse warehouse1 = new Warehouse();
        warehouse1.setBalance(2998000);
        warehouse1.setCountOrders(2998);

        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        courier1.doWork();
        picker1.doWork();
        System.out.println(warehouse1);
        System.out.println("Зарплата курьера из первого скалада: " + courier1.getSalary());
        System.out.println("Зарплата сборщика из первого скалада: " + picker1.getSalary());

        courier1.doWork();
        picker1.doWork();
        System.out.println(warehouse1);
        System.out.println("Зарплата курьера из первого скалада: " + courier1.getSalary());
        System.out.println("Зарплата сборщика из первого скалада: " + picker1.getSalary());
        System.out.println();

        // warehouse2
        Warehouse warehouse2 = new Warehouse();
        warehouse2.setBalance(2300);
        warehouse2.setCountOrders(111);

        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        courier2.doWork();
        picker2.doWork();
        courier2.doWork();
        picker2.doWork();
        System.out.println(warehouse2);
        System.out.println("Зарплата курьера из второго скалада: " + courier2.getSalary());
        System.out.println("Зарплата сборщика из второго скалада: " + picker2.getSalary());
    }
}
