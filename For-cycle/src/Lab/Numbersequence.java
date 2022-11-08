package Lab;

import java.util.Scanner;

public class Numbersequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i <= numberOfNumbers; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxNum) {
                maxNum = number;
            }

            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);

    }
}
