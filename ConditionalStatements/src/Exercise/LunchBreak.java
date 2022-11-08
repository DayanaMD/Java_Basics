package Exercise;

import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int minSerial = Integer.parseInt(scanner.nextLine());
        int minBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = minBreak * (1 / 8.0);
        double timeForRest = minBreak / 4.0;
        double freeTime = (minBreak - timeForRest - timeForLunch);


        if (freeTime >= minSerial) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serial, Math.ceil(freeTime - minSerial));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serial, Math.ceil(minSerial - freeTime));
        }


    }
}
