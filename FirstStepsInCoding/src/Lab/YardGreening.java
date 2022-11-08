package Lab;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metres = Double.parseDouble(scanner.nextLine());

        double Price = metres * 7.61;

        double discount = Price * 0.18;

        double finalPrice = Price - discount;

        System.out.println("The final price is:" + finalPrice +" lv.");
        System.out.println("The discount is: " + discount +" lv.");

    }
}
