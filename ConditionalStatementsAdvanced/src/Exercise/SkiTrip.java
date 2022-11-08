package Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();

        double night = days - 1;

        switch (room) {

            case "room for one person":
                night *= 18;
                break;
            case "apartment":
                if (days < 10) {
                    night *= 25 * 0.70;
                } else if (days >= 10 && days < 15) {
                    night *= 25 * 0.65;
                } else if (days > 15) {
                    night *= 25 * 0.50;
                }
                break;

            case "president apartment":
                if (days < 10) {
                    night *= 35 * 0.90;
                } else if (days >= 10 && days < 15) {
                    night *= 35 * 0.85;
                } else if (days > 15) {
                    night *= 35 * 0.80;
                }
                break;


        }
        if (feedback.equals("positive")) {
            night *= 1.25;
        }else{
            night *= 0.90;
        }

        System.out.printf("%.2f", night);
    }
}
