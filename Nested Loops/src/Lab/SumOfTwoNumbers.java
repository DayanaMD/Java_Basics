package Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int firstComb = 0;
        int allComb = 0;
        boolean isItFound = false;
        int i = 0;
        int k = 0;

        for (i = startNum; i <= endNum; i++) {
            for ( k = startNum; k <= endNum; k++) {

                allComb++;

                if (i + k == magicNum) {

                    isItFound = true;
                    break;

                }

            }

            if (isItFound) {
                break;
            }
        }

        if (!isItFound) {
            System.out.printf("%d combinations - neither equals %d", allComb, magicNum);
        } else {
            System.out.printf("Combination N:%d (%d + %d = %d)", allComb, i, k, magicNum);
        }


    }
}
