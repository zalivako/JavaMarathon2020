package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int age = Integer.parseInt(person[person.length - 1]);
                if (age < 0) {
                    throw new ExceptionForTask("Некорректный входной файл");
                }
                list.add(new Person(person[0], age));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ExceptionForTask exceptionForTask) {
            System.out.println(exceptionForTask.getMessage());
        }
        return list;
    }
}
