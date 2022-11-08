package Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int printh = h;
        int printm = m + 15;

        if (printm > 59) {
            printh = h + 1;
            printm = printm - 60;
        }

        if (printh > 23) {
            printh = 0;
        }

        if (printm < 10) {

            System.out.printf("%d:0%d", printh, printm);
        } else {
            System.out.printf("%d:%d", printh, printm);
        }
    }

}
