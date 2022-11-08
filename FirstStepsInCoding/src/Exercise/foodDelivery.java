package Exercise;

import java.util.Scanner;

public class foodDelivery {

    public static void main(String[] args) {

        //⦁	Пилешко меню –  10.35 лв.
        //⦁	Меню с риба – 12.40 лв.
        //⦁	Вегетарианско меню  – 8.15 лв

        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetableMenu = Integer.parseInt(scanner.nextLine());

        double sumBeforeDesert = chickenMenu * 10.35 + fishMenu * 12.40 + vegetableMenu * 8.15;
        double desert = sumBeforeDesert * 20 / 100.0;
        double sumFood = sumBeforeDesert + desert + 2.50;

        System.out.println(sumFood);



    }

}
