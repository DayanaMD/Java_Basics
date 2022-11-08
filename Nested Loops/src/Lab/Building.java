package Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int roomsOneFloor = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1; f--) {
            for (int a = 0; a < roomsOneFloor; a++) {

                if (f == floors) {
                    System.out.printf("L%d%d ", f, a);
                } else if (f % 2 == 0) {
                    System.out.printf("O%d%d ", f, a);
                } else {
                    System.out.printf("A%d%d ", f, a);
                }
            }

            System.out.println();

        }

    }
}
