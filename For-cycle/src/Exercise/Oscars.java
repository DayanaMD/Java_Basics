package Exercise;

import java.util.Scanner;

public class Oscars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double pointAcademy = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());

        double currentPoint = 0.00;

        for (int i = 1; i <= numberOfJury; i++) {
            String nameOfJury = scanner.nextLine();
            int numberLetters = nameOfJury.length();

            double juryPoint = Double.parseDouble(scanner.nextLine());

            currentPoint = pointAcademy + ((numberLetters * juryPoint) / 2);
            pointAcademy = currentPoint;

            if (currentPoint > 1250.5) {
                break;
            }

        }

        if (currentPoint > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, currentPoint);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - currentPoint);
        }
    }
}
