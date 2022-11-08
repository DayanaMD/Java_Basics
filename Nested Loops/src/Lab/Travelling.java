package Lab;

import java.security.interfaces.DSAPublicKey;
import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String destination = command;

            double tripExpense = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while(sum < tripExpense){

                double saveMoney = Double.parseDouble(scanner.nextLine());

                sum = sum + saveMoney;


            }

            System.out.printf("Going to %s!%n", destination);

            command = scanner.nextLine();

        }

    }

}
