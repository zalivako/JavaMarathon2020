package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file1");
        printResult(file);
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String[] numbersFromString = scanner.nextLine().split(" ");
            int sum = 0;
            int counter = 0;
            for (String string : numbersFromString) {
                sum += Integer.parseInt(string);
                counter++;
            }
            double value = (double) sum / counter;
            System.out.print(value + " --> " + String.format("%.3f", value));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
