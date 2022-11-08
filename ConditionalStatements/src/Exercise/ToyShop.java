package Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double travelCost = Double.parseDouble(scanner.nextLine());
        int qtyPuzzle = Integer.parseInt(scanner.nextLine());
        int qtyDolls = Integer.parseInt(scanner.nextLine());
        int qtyBears = Integer.parseInt(scanner.nextLine());
        int qtyMinions = Integer.parseInt(scanner.nextLine());
        int qtyTrucks = Integer.parseInt(scanner.nextLine());

        int totalQty = qtyBears + qtyDolls + qtyMinions + qtyTrucks + qtyPuzzle;

        double priceBeforeDiscount = ( qtyMinions * 8.20 +
                qtyBears * 4.10 + qtyDolls * 3 + qtyTrucks * 2 + qtyPuzzle * 2.60) * 0.9;


        double priceAfterDiscount = 0.00;

        if( totalQty >= 50){

            priceAfterDiscount = priceBeforeDiscount * 0.75;

        } else{
            priceAfterDiscount = priceBeforeDiscount;
        }

        if( priceAfterDiscount >= travelCost){
            System.out.printf("Yes! %.2f lv left.", Math.abs(priceAfterDiscount - travelCost));
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(priceAfterDiscount - travelCost) );
        }

    }
}
