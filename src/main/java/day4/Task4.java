package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int maxSumOfThree = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = array[i] + array[i + 1] + array[2];
            if (sum >= maxSumOfThree) {
                maxSumOfThree = sum;
                index = i;
            }
        }
        System.out.println(maxSumOfThree);
        System.out.println(index);

    }
}
