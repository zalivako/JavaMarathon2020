package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i >= 9) System.out.println("Многоэтажный дом");
        else if (i >= 5) System.out.println("Среднеэтажный дом");
        else if (i >= 1) System.out.println("Малоэтажный дом");
        else System.out.println("Ошибка ввода");
    }
}
