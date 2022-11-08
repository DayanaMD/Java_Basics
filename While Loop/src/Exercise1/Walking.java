package Exercise1;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumSteps = 0;
        boolean isItReached = false;

        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);

            sumSteps = sumSteps + steps;

            if (sumSteps >= 10000) {
                isItReached = true;
                break;
            }

            command = scanner.nextLine();

        }
        if (isItReached) {

            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sumSteps - 10000);
        }

        if (!isItReached) {

            command = scanner.nextLine();
            int steps = Integer.parseInt(command);
            sumSteps = sumSteps + steps;

            if (sumSteps >= 10000) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sumSteps - 10000);
            } else {

                System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
            }


        }

    }
}
