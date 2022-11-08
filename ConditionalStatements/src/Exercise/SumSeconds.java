package Exercise;

import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstSec = Integer.parseInt(scanner.nextLine());
        int secondSec = Integer.parseInt(scanner.nextLine());
        int thirdSec = Integer.parseInt(scanner.nextLine());


        double totalSec = firstSec + secondSec + thirdSec;

        double min = Math.floor(totalSec / 60);

        double sec = totalSec % 60;


        if ( sec < 10) {

            System.out.printf("%.0f:0%.0f", min, sec);


        }else{
            System.out.printf("%.0f:%.0f", min, sec);
        }

    }
}
