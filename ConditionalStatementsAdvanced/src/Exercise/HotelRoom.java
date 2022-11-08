package Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double studio = 0.00;
        double apartment = 0.00;

        switch (month) {
            case "May":
            case "October":
                studio = days * 50.00;
                apartment = days * 65.00;

                if (days > 14 ) {
                    studio *= 0.70;
                    apartment *= 0.90;
                } else if (days > 7) {
                    studio *= 0.95;

                }
                break;

            case "June":
            case "September":

                studio = days * 75.20;
                apartment = days * 68.70;

                if (days > 14) {
                    studio *= 0.80;
                    apartment *= 0.90;
                }
                break;

            case "July":
            case "August":
                studio = days * 76.00;
                apartment = days * 77.00;

                if (days > 14) {
                    apartment *= 0.90;
                }

                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }

}
