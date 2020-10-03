package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new ArrayList<>(Arrays.asList("volvo", "bmv", "kia", "mazda", "audi"));
        list.add("volvo");
        list.add("bmv");
        list.add("kia");
        list.add("mazda");
        list.add("audi");
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();

        list.add(2, "nissan");
        list.remove(0);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
