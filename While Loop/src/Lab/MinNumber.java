package Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int number = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {

            int enteredNumber = Integer.parseInt(command);

            if (enteredNumber < number) {
                number = enteredNumber;
            }
           command = scanner.nextLine();
        }

        System.out.println(number);

    }
}
