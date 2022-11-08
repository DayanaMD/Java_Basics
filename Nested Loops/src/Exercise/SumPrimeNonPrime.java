package Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumPrimeNum = 0;
        int sumNoPrimeNum = 0;

        while (!command.equals("stop")) {

            int number = Integer.parseInt(command);
            boolean itIsPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");

                command = scanner.nextLine();
                continue;

            }

            if (number == 1) {
                sumPrimeNum = sumPrimeNum + number;
            }

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    itIsPrime = false;
                    break;
                }
            }

            if (itIsPrime) {
                sumPrimeNum = sumPrimeNum + number;

            } else {
                sumNoPrimeNum = sumNoPrimeNum + number;

            }

            command = scanner.nextLine();



        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d", sumNoPrimeNum);


    }
}






