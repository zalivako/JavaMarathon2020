package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] randomArray = new int[x];

        int moreThenEight = 0;
        int equalsOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(11);
            if (randomArray[i] > 8) {
                moreThenEight++;
            }
            if (randomArray[i] == 1) {
                equalsOne++;
            }
            if (randomArray[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += randomArray[i];
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Длине массива: " + randomArray.length);
        System.out.println("Количестве чисел больше 8: " + moreThenEight);
        System.out.println("Количестве чисел равных 1: " + equalsOne);
        System.out.println("Количестве четных чисел: " + even);
        System.out.println("Количестве нечетных чисел: " + odd);
        System.out.println("Сумме всех элементов массива: " + sum);
    }
}
