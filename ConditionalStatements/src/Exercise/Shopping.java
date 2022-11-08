package Exercise;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int qVideoCards = Integer.parseInt(scanner.nextLine());
        int qProcessors = Integer.parseInt(scanner.nextLine());
        int qRamMemory = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = qVideoCards * 250;
        double priceProcessor = priceVideoCards * 0.35 * qProcessors;
        double priceRamMemory = priceVideoCards * 0.10 * qRamMemory;

        double totPriceBeforeDisc = priceProcessor + priceRamMemory + priceVideoCards;

        if (qVideoCards > qProcessors) {
            totPriceBeforeDisc *= 0.85;
        }

        if (budget >= totPriceBeforeDisc) {
            System.out.printf("You have %.2f leva left!", budget - totPriceBeforeDisc);


        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totPriceBeforeDisc - budget);
        }

    }

}




