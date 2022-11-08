package Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;

        if (number >= 100 && number <= 200 || number == 0){
         isValid = false;

        }

        if (isValid){
            System.out.println("invalid");
        }


    }
}
