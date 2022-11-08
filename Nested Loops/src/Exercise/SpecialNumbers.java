package Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int specialNum = Integer.parseInt(scanner.nextLine());
        int currentNum = 0;
        boolean itIsFound = false;

        for (int j = 1111; j <= 9999; j++) {

            String currentNumStr = String.valueOf(j);
            int numLength = currentNumStr.length();
//            char testNum = currentNumStr.charAt(0);
//            String digit = String.valueOf(testNum);
//            int digitN = Integer.parseInt(digit);

//            char numS = currentNumStr.charAt(0);
//            String currNumString = String.valueOf(numS);
//            int currNumDigit = Integer.parseInt(currNumString);
            int count = 0;
            for (int l = 0; l < numLength; l++) {

                char symbol = currentNumStr.charAt(l);
                int digit = Integer.parseInt(String.valueOf(symbol));

                if (digit == 0) {
                    continue;
                }

                if (specialNum % digit == 0) {

                    count++;
                }


            }

            if (count == 4) {
                System.out.printf("%d ", j);
            }


        }


    }
}
