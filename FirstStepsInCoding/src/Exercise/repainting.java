package Exercise;

import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {

        //⦁	Предпазен найлон - 1.50 лв. за кв. метър
        //⦁	Боя - 14.50 лв. за литър
        //⦁	Разредител за боя - 5.00 лв. за литър

        Scanner scanner = new Scanner(System.in);

        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int changePaint = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        //За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и
        // 2 кв.м. найлон, разбира се и
        // 0.40 лв. за торбички.

        double paintBeforeAdd = paint * 14.50;
        double paintAfter = paintBeforeAdd + paintBeforeAdd * 10 / 100.0;

        double sumMaterials = (naylon + 2) * 1.50 + paintAfter + changePaint * 5.00 + 0.40;

        double laborPricePerHour = sumMaterials  * 30 / 100.0;
        double laborSum = laborPricePerHour * hours;

        double totalSum = sumMaterials + laborSum;

        System.out.println(totalSum);


    }
}
