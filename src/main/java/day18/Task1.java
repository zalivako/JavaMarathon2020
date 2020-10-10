package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241};
        System.out.println(Sum(numbers)); // version 1 - первое решение
        System.out.println(recursionSum(numbers, 0)); // version 2 - решение после просмотра автотестов
    }

    //    version 1
    public static int Sum(int[] numbers) {
        return recursionSumV1(numbers, numbers.length - 1);
    }

    public static int recursionSumV1(int[] numbers, int i) {
        if (i == 0) {
            return numbers[i];
        }
        return numbers[i] + recursionSumV1(numbers, (i - 1));
    }

    //    version 2
    public static int recursionSum(int[] numbers, int i) {
        if (i == numbers.length) {
            return 0;
        }
        return numbers[i] + recursionSum(numbers, (i + 1));
    }
}
