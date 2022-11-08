package Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        switch (season) {
            case "Spring":
                price = 3000;

                break;
            case "Summer":
            case "Autumn":
                price = 4200;

                break;
            case "Winter":
                price = 2600;

                break;
        }

        if (fisherman <= 6) {
            price *= 0.90;
        } else if (fisherman > 7 && fisherman <= 12) {
            price *= 0.85;
        } else if (fisherman > 12) {
            price *= 0.75;
        }

       if(fisherman % 2 == 0 && !season.equals("Autumn")){
           price *= 0.95;
       }

       if(budget >= price){
           System.out.printf("Yes! You have %.2f leva left.", budget - price);
       }else{

           System.out.printf("Not enough money! You need %.2f leva.", Math.abs(price - budget));
       }
    }
}
