package Exercise;

import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGames = Integer.parseInt(scanner.nextLine());
        int startingPoint = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int numberOfGamesTotal = 0;
        int numberOfWin = 0;

        for (int i = 1; i <= numberOfGames; i++) {
            numberOfGamesTotal++;
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                points += 2000;
                numberOfWin++;
            } else if (stage.equals("F")) {
                points += 1200;
            } else if (stage.equals("SF")) {
                points += 720;
            }

        }

        int totalSumPoints = points + startingPoint;

        System.out.printf("Final points: %d%n", totalSumPoints);

        int averagePoints = points / numberOfGamesTotal;

        System.out.printf("Average points: %.0f%n",Math.floor(averagePoints));

        double percentWin = numberOfWin * 1.0 / numberOfGamesTotal * 100;

        System.out.printf("%.2f%%", percentWin);

    }
}
