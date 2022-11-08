package Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int qtyFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        switch (flower) {
            case "Roses":
                price = qtyFlowers * 5.00;

                if (qtyFlowers > 80) {
                    price *= 0.90;
                }
                break;
            case "Dahlias":
                price = qtyFlowers * 3.80;

                if (qtyFlowers > 90) {

                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = qtyFlowers * 2.80;
                if (qtyFlowers > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = qtyFlowers * 3.00;
                if (qtyFlowers < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = qtyFlowers * 2.50;
                if (qtyFlowers < 80) {
                    price *= 1.20;
                }
                break;

        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    qtyFlowers, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
