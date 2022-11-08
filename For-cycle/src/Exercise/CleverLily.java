package Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int priceForOne = Integer.parseInt(scanner.nextLine());

        int qntToys = 0;
        double sum = 0.00;
        double saved = 0.00;


        for (int i = 1; i <= years; i++) {

            if (i % 2 == 0) {
                sum += 10;
                saved += sum - 1;


            } else {
                qntToys++;
            }

        }

        double totSum = saved + qntToys * priceForOne;

        if (totSum >= washerPrice) {
            System.out.printf("Yes! %.2f", totSum - washerPrice);

        } else {
            System.out.printf("No! %.2f", washerPrice - totSum);
        }

    }
}
