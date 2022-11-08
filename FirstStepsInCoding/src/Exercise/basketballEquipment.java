package Exercise;

import java.util.Scanner;

public class basketballEquipment {

    public static void main(String[] args) {

        //⦁	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //⦁	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //⦁	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //⦁	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax -( tax * 40 / 100.0);
        double clothes =shoes - ( shoes * 20 / 100.0);
        double ball = clothes * 1 / 4;
        double accessories = ball * 1 / 5;

        double price = tax + shoes + clothes + ball + accessories;

        System.out.println(price);
    }
}
