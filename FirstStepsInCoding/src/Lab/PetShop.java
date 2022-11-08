package Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dogsPackeges = Integer.parseInt(scanner.nextLine());
        int catPackeges = Integer.parseInt(scanner.nextLine());

        double sum = catPackeges * 4 + dogsPackeges * 2.5;

        System.out.println(sum + " lv.");
    }
}
