package Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner inputinch = new Scanner(System.in);

        double a = Double.parseDouble(inputinch.nextLine());
        double b = a * 2.54;

        System.out.println(b);
    }
}
