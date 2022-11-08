package Exercise;

import java.util.Scanner;

public class SpecialNumbersSmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int specialNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {

                for (int k = 1; k <= 9; k++) {

                    for (int l = 1; l <= 9; l++) {

                        if ((specialNum % i == 0) && (specialNum % j == 0)
                                && (specialNum % k == 0) && (specialNum % l == 0)) {

                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}
