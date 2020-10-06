package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");

        try (Scanner scanner = new Scanner(fileIn); PrintWriter printWriter = new PrintWriter(fileOut)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");

                if (Integer.parseInt(shoes[shoes.length - 1]) == 0) {
                    printWriter.println(line.replace(";", ", "));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
