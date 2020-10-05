package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String[] numbersFromString = scanner.nextLine().split(" ");
            if (numbersFromString.length != 10) {
                throw new ExceptionForTask("Некорректный входной файл");
            }
            int sum = 0;
            for (String string : numbersFromString) {
                sum += Integer.parseInt(string);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ExceptionForTask exceptionForTask) {
            System.out.println(exceptionForTask.getMessage());
        }
    }
}
