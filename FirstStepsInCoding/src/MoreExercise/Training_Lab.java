package MoreExercise;

import java.util.Scanner;

public class Training_Lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wInSmWoEntry = w * 100 ;
        double hInSmWoEntry = h * 100 - 100;

        //Коридорът е широк поне 100 cm;
        //работно място заема 70 на 120 cm;

        double deskW =  wInSmWoEntry / 120;
        double deskH = hInSmWoEntry / 70;

        int  total = (int)  deskH * (int) deskW - 3;

        System.out.println(total);

    }
}
