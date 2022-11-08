package Exam;

import java.util.Scanner;

public class Substitute {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int countComb = 0;

        for (int i = k; i <= 8; i++) {

            for (int d = 9; d >= l; d--) {

                for (int g = m; g <= 8; g++) {

                    for (int h = 9; h >= n; h--) {

                        if ((i % 2 == 0) && (g % 2 == 0) && (d % 2 != 0) && (h % 2 != 0)) {

                            if (countComb >= 6) {

                                break;
                            }

                            if ((i == g) && (d == h)) {
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i, d, g, h);
                                countComb++;
                            }


                        }


                    }
                }


            }
        }
    }


}




