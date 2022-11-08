package Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceClothesForOne = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.10;
        double priceClothes = people * priceClothesForOne;

        if (people > 150) {
            priceClothes *= 0.90;
        }

        double totalPrice = priceClothes + priceDecor;

        if (totalPrice > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }

        }


    }
