package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        int index = 0;
        int sumOfLine = 0;
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51);
                sumOfLine += matrix[i][j];
            }
            if (sumOfLine >= max) {
                max = sumOfLine;
                index = i;
            }
            sumOfLine = 0;
        }
        System.out.println("Ответ: " + index);
    }
}
