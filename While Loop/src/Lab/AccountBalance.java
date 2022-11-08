package Lab;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0.00;

        while (!command.equals("NoMoreMoney")) {
            double money = Double.parseDouble(command);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", money);
            sum = sum + money;
            command = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", sum);
    }
}
