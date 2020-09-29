package day8;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);

        long start2 = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";
        }
        System.out.println(string);
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);
    }
}
