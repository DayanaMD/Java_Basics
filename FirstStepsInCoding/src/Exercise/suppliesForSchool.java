package Exercise;

import java.util.Scanner;

public class suppliesForSchool {

    public static void main(String[] args) {
        //⦁	Пакет химикали - 5.80 лв.
        //⦁	Пакет маркери - 7.20 лв.
        //⦁	Препарат - 1.20 лв (за литър)

        Scanner scanner = new Scanner(System.in);

        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarkers = Integer.parseInt(scanner.nextLine());
        int litersWash = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePens = packPens * 5.80;
        double priceMarkers = packMarkers * 7.20;
        double priceLiters = litersWash * 1.20;

        double sumBeforeDiscount = pricePens + priceLiters + priceMarkers;
        double discount = sumBeforeDiscount * percentDiscount / 100.0;
        double finalSum = sumBeforeDiscount - discount;

        System.out.println(finalSum);


    }

}

