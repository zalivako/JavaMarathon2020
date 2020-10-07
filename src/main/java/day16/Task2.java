package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file_1 = new File("file_1.txt");
        File file_2 = new File("file_2.txt");
        randomNumbers(file_1, file_2);
        printResult(file_2);
    }

    public static void randomNumbers(File file1, File file2) {
        try (PrintWriter printWriter1 = new PrintWriter(file1); PrintWriter printWriter2 = new PrintWriter(file2)) {
            for (int x = 0; x < 50; x++) {
                int sum = 0;
                for (int y = 0; y < 20; y++) {
                    int randomNumber = (int) (Math.random() * 100);
                    printWriter1.print(randomNumber + " ");
                    sum += randomNumber;
                }
                double value = (double) sum / 20;
                printWriter2.print(value + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String[] numbersFromString = scanner.nextLine().split(" ");
            double sum = 0;
            int counter = 0;
            for (String string : numbersFromString) {
                sum += Double.parseDouble(string);
                counter++;
            }
            double value = sum / counter;
            System.out.println((int) value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
