package Exam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int qntLoveLetters = Integer.parseInt(scanner.nextLine());
        int qntVRoss = Integer.parseInt(scanner.nextLine());
        int qntKeyHolder = Integer.parseInt(scanner.nextLine());
        int qntPaint = Integer.parseInt(scanner.nextLine());
        int qntLucky = Integer.parseInt(scanner.nextLine());

        double totSell = (qntLoveLetters * 0.60 + qntVRoss * 7.20 + qntKeyHolder * 3.60 + qntPaint * 18.20 + qntLucky * 22);

        int totQty = qntLoveLetters + qntKeyHolder + qntVRoss + qntPaint + qntLucky;

        if (totQty >= 25) {

            totSell = totSell * 0.65;
        }

        double finGain = totSell * 0.90;

        if (finGain >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.", finGain - partyPrice);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(finGain - partyPrice));
        }


    }
}
