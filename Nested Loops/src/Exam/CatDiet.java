package Exam;

import java.util.Scanner;

public class CatDiet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prFat =Integer.parseInt(scanner.nextLine());
        int prProt =Integer.parseInt(scanner.nextLine());
        int prVagleh =Integer.parseInt(scanner.nextLine());
        int totCal =Integer.parseInt(scanner.nextLine());
        int prWater =Integer.parseInt(scanner.nextLine());

        double totFat = prFat / 100.00 * totCal / 9;
        double totVagleh = prVagleh / 100.00 * totCal / 4;
        double totProt = prProt / 100.00 * totCal / 4;

        double footWeight = totFat + totVagleh + totProt;

        double calOneGram = totCal / footWeight;

        double prWoWater = 100 - prWater;

        double cal = prWoWater / 100 * calOneGram;

        System.out.printf("%.4f", cal);




    }

}
