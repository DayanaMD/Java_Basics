package Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());

        int cMusala = 0;
        int cMontblan = 0;
        int cKilimandjaro = 0;
        int cK2 = 0;
        int cEverest = 0;

        for (int i = 1; i <= groupNumber; i++) {
            int peopleInOneGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInOneGroup <= 5) {
                cMusala += peopleInOneGroup;
            } else if (peopleInOneGroup <= 12) {
                cMontblan += peopleInOneGroup;
            } else if (peopleInOneGroup <=25) {
                cKilimandjaro += peopleInOneGroup;
            } else if (peopleInOneGroup <= 40) {
                cK2 += peopleInOneGroup;
            } else if ( peopleInOneGroup <= 1000) {
                cEverest += peopleInOneGroup;
            }

        }

        int cTotal = cMusala + cK2 + cKilimandjaro + cEverest + cMontblan;

        // int cMusala = 0;
        // int cMontblan = 0;
        // int cKilimandjaro = 0;
        // int cK2 = 0;
        // int cEverest = 0;

        double prMusala = cMusala * 1.0 / cTotal * 100.00;
        double prMontblan = cMontblan * 1.0 / cTotal * 100.00;
        double prKilimandjaro = cKilimandjaro * 1.0 / cTotal * 100.00;
        double prK2 = cK2 * 1.0 / cTotal * 100.00;
        double prEverest = cEverest * 1.0 / cTotal * 100.00;

        System.out.printf("%.2f%%%n", prMusala);
        System.out.printf("%.2f%%%n", prMontblan);
        System.out.printf("%.2f%%%n", prKilimandjaro);
        System.out.printf("%.2f%%%n", prK2);
        System.out.printf("%.2f%%%n", prEverest);


    }
}
