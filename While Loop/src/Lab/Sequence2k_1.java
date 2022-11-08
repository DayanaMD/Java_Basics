package Lab;

import java.util.Scanner;

public class Sequence2k_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int newNumber = 0;

        while (newNumber < number) {

            newNumber = newNumber * 2 + 1;

            if (newNumber <= number) {
                System.out.println(newNumber);
            }


        }


    }
}
