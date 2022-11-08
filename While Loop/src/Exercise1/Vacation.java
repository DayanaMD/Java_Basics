package Exercise1;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countSpent = 0;
        boolean itIsDone = true;
        int totalDays = 0;

        while (availableMoney < vacationCost) {

            if (countSpent >= 5) {
                itIsDone = false;
                break;
            }



            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                countSpent++;
                totalDays++;

                availableMoney = availableMoney - amount;

                if (availableMoney < 0) {
                    availableMoney = 0;
                }


            } else {
                countSpent = 0;
                totalDays++;

                availableMoney = availableMoney + amount;


            }


        }

        if (itIsDone) {
            System.out.printf("You saved the money for %d days.", totalDays);

        } else {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d", totalDays);
        }

    }
}
