package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2018, 60, 160120);
        airplane1.info();
        airplane1.setYear(2017);
        airplane1.setLength(57);
        airplane1.fillUp(70000);
        airplane1.fillUp(50000);
        airplane1.info();
    }
}
