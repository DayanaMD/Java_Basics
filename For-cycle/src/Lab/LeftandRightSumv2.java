package Lab;

import java.util.Scanner;

public class LeftandRightSumv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfCoupes = Integer.parseInt(scanner.nextLine());

        int numbersInTotal = 2 * numbersOfCoupes;
        int sumLeft = 0;
        int sumRight =0;

        for(int i = 1; i<=numbersInTotal; i++){

            int number = Integer.parseInt(scanner.nextLine());

            if( i <= numbersOfCoupes){
                sumLeft += number;
            }else{
                sumRight += number;
            }

        }

        if(sumRight == sumLeft){

            System.out.printf("Yes, sum = %d", sumLeft);
        }else{
            int diff = Math.abs(sumLeft-sumRight);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
