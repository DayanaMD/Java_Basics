package Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalAllMovie = 0;
        int totalStandart = 0;
        int totalStudent = 0;
        int totalKid = 0;

        while (!command.equals("Finish")) {

            String movie = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int countTickets = 0;

            while (!input.equals("End")) {

                String ticket = input;
                countTickets++;
                totalAllMovie++;

                switch (ticket) {

                    case "student":
                        totalStudent++;
                        break;
                    case "standard":
                        totalStandart++;
                        break;
                    case "kid":
                        totalKid++;
                        break;

                }

                if (countTickets == freeSeats) {
                    break;
                }

                input = scanner.nextLine();

            }

            System.out.printf("%s - %.2f%% full.%n", movie, countTickets * 100.00 / freeSeats);

            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalAllMovie);
        System.out.printf("%.2f%% student tickets.%n", totalStudent * 1.0 / totalAllMovie * 100.00);
        System.out.printf("%.2f%% standard tickets.%n", totalStandart * 1.0 / totalAllMovie * 100.00);
        System.out.printf("%.2f%% kids tickets.%n", totalKid * 1.0 / totalAllMovie * 100.00);


    }
}
