package Lab;

import java.util.Scanner;

public class GreetingByName {

    public static void main(String[] args) {
        Scanner entryName = new Scanner(System.in);

        String name = entryName.nextLine();

        System.out.println("Hello," +" "+ name +"!");


    }
}
