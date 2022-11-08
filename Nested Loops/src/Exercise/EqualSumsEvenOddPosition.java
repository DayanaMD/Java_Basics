package Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (int i = numOne; i <= numTwo; i++) {
            String num = Integer.toString(i);
            int lengthNum = num.length();

            int sumEven = 0;
            int sumOdd = 0;

            for (int k = 0; k < lengthNum; k++) {

                char symbol = num.charAt(k);

                int letterNum = Integer.parseInt(String.valueOf(symbol));

                if (k % 2 == 0) {
                    sumEven = sumEven + letterNum;

                } else {
                    sumOdd = sumOdd + letterNum;
                }


            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");

            }


        }

    }

}

