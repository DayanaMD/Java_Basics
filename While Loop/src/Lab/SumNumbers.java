package Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < number) {

            int enteredNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + enteredNumber;

        }
        System.out.printf("%d", sum);

    }
}
