package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int min = array[1];
        int max = array[1];
        int counterDivisibleByTen = 0;
        int sumOfDivisibleByTen = 0;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            if (i % 10 == 0) {
                counterDivisibleByTen++;
                sumOfDivisibleByTen += i;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + counterDivisibleByTen);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sumOfDivisibleByTen);

    }
}
