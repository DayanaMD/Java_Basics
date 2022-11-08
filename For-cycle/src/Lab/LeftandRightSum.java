package Lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPairs = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= numberOfPairs; i++) {
            int numberLeft = Integer.parseInt(scanner.nextLine());
            sumLeft += numberLeft;


        }
        for (int i = 1; i <= numberOfPairs; i++) {
            int numberRight = Integer.parseInt(scanner.nextLine());
            sumRight += numberRight;

        }
        if(sumRight == sumLeft){

            System.out.printf("Yes, sum = %d", sumLeft);
        }else{
            int diff = Math.abs(sumLeft-sumRight);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
