package Exercise1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
//        double totalCoins = Math.round(amount * 100);

        double amountInCoins = Math.floor(amount) * 100;

        double coinsAfterDot = (amount * 100) % 100;
        double totalCoins = Math.round(amountInCoins + coinsAfterDot);

//        String amount = scanner.nextLine();
//        String[] coins = amount.split(Pattern.quote("."));
//        String coinsToString = coins.toString();
//        int coinsLeva = Integer.valueOf(coins)

        int numberOfCoins = 0;

        while (totalCoins > 0) {

            if (totalCoins >= 200) {

                totalCoins = totalCoins - 200;
                numberOfCoins++;
            } else if (totalCoins >= 100) {

                totalCoins = totalCoins - 100;
                numberOfCoins++;
            } else if (totalCoins >= 50) {

                totalCoins = totalCoins - 50;
                numberOfCoins++;
            } else if (totalCoins >= 20) {

                totalCoins = totalCoins - 20;
                numberOfCoins++;
            } else if (totalCoins >= 10) {

                totalCoins = totalCoins - 10;
                numberOfCoins++;
            } else if (totalCoins >= 5) {

                totalCoins = totalCoins - 5;
                numberOfCoins++;
            } else if (totalCoins >= 2) {

                totalCoins = totalCoins - 2;
                numberOfCoins++;
            } else if (totalCoins >= 1) {

                totalCoins = totalCoins - 1;
                numberOfCoins++;

            }

        }
        System.out.println(numberOfCoins);

    }
}
