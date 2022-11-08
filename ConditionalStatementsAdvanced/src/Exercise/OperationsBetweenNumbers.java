package Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0.00;
        String type = "";

        switch (symbol) {
            case "+":
                result = num1 + num2;

                if (result % 2 == 0) {
                    type = "even";

                } else {
                    type = "odd";
                }

                System.out.printf("%d + %d = %.0f - %s%n", num1, num2, result, type);

                break;
            case "-":
                result = num1 - num2;

                if (result % 2 == 0) {
                    type = "even";

                } else {
                    type = "odd";
                }

                System.out.printf("%d - %d = %.0f - %s%n", num1, num2, result, type);

                break;
            case "*":
                result = num1 * num2;

                if (result % 2 == 0) {
                    type = "even";

                } else {
                    type = "odd";
                }

                System.out.printf("%d * %d = %.0f - %s%n", num1, num2, result, type);

                break;

            case "/":

                if (num1 != 0 && num2 != 0) {
                    result = (double) num1 / (double) num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", num2);

                }
                break;

            case "%":
                if (num1 != 0 && num2 != 0) {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %.0f", num1, num2, result);

                } else {
                    System.out.printf("Cannot divide %d by zero", num2);
                }

                break;


        }


    }
}
