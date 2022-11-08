package Exercise;


import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber;

            if (currentNumber > maxNum) {
                maxNum = currentNumber;
            }


        }

        if ((sum - maxNum) == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum - (sum - maxNum)));
        }


    }
}
