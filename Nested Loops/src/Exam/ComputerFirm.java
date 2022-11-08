package Exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computers = Integer.parseInt(scanner.nextLine());

        double makeSales = 0;
        int countLasts = 0;
        double sumLasts = 0;

        for (int i = 1; i <= computers; i++) {



            int sales = Integer.parseInt(scanner.nextLine());
            char last = String.valueOf(sales).charAt(2);
            char first = String.valueOf(sales).charAt(0);
            char second = String.valueOf(sales).charAt(1);

            int lastToInt = Integer.parseInt(String.valueOf(last));

            String firstPlusSecond = String.valueOf(first) + String.valueOf(second);

            int possibleSales = Integer.parseInt(firstPlusSecond);

            sumLasts = sumLasts + lastToInt;
            countLasts++;

            if (lastToInt == 2) {
                makeSales = makeSales;


            } else if (lastToInt == 3) {
                makeSales = makeSales + possibleSales * 0.50;


            } else if (lastToInt == 4) {
                makeSales = makeSales +possibleSales * 0.70;


            } else if (lastToInt == 5) {
                makeSales = makeSales+ possibleSales * 0.85;


            } else if (lastToInt == 6) {
                makeSales = makeSales +possibleSales;

            }


        }

        System.out.printf("%.2f%n", makeSales);

        double average = sumLasts / countLasts;

        System.out.printf("%.2f", average);
    }
}
