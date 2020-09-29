package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2018, 60, 160120);
        Airplane airplane2 = new Airplane("Airbus", 2017, 61, 180030);
        Airplane airplane3 = new Airplane("TU-154", 2008, 60, 160120);
        Airplane.compareAirplanes(airplane1, airplane2);
        Airplane.compareAirplanes(airplane1, airplane3);
    }
}