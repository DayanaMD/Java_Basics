package Exercise;

import java.util.Scanner;

public class depositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositAmount = Double.parseDouble(scanner.nextLine());
        int termsDeposit = Integer.parseInt(scanner.nextLine());
        double yearsPercent = Double.parseDouble(scanner.nextLine());

        double sum = depositAmount + termsDeposit * ((depositAmount * yearsPercent/100.0) / 12);

        System.out.println(sum);




    }
}
