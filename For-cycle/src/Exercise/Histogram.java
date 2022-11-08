package Exercise;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= numberOfNumbers; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber <= 399) {
                p2++;
            } else if (currentNumber <= 599) {
                p3++;
            } else if (currentNumber <= 799) {
                p4++;

            } else if(currentNumber >= 800 ){
                p5++;
            }
        }
        double p1Pr = p1 * 1.0 / numberOfNumbers * 100.00;
        double p2Pr = p2 * 1.0 / numberOfNumbers * 100.00;
        double p3Pr = p3 * 1.0 / numberOfNumbers * 100.00;
        double p4Pr = p4 * 1.0 / numberOfNumbers * 100.00;
        double p5Pr = p5 * 1.0 / numberOfNumbers * 100.00;

        System.out.printf("%.2f%%%n", p1Pr);
        System.out.printf("%.2f%%%n", p2Pr);
        System.out.printf("%.2f%%%n", p3Pr);
        System.out.printf("%.2f%%%n", p4Pr);
        System.out.printf("%.2f%%%n", p5Pr);



    }
}
