package Exam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.00;

        if (people <= 5) {

            switch (season) {
                case "spring":
                    price = people * 50.00;
                    break;
                case "summer":
                    price = (people * 48.50) * 0.85;
                    break;
                case "autumn":
                    price = people * 60.00;
                    break;
                case "winter":
                    price = (people * 86.00) * 1.08;
                    break;
            }


        } else if (people > 5) {

           switch(season) {
                case "spring":
                    price = people * 48.00;
                    break;
                case "summer":
                    price = (people * 45.00) * 0.85;
                    break;
                case "autumn":
                    price = people * 49.50;
                    break;
                case "winter":
                    price = (people * 85.00) * 1.08;
                    break;
            }

        }

        System.out.printf("%.2f leva.", price);


    }
}
