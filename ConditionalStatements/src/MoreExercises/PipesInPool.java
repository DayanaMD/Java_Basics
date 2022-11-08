package MoreExercises;

import java.util.Scanner;

public class PipesInPool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeInLiters = Integer.parseInt(scanner.nextLine());
        int debitP1ForOneHour = Integer.parseInt(scanner.nextLine());
        int debitP2ForOneHour = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double volumeForHoursP1 = debitP1ForOneHour * hours;
        double volumeForHoursP2 = debitP2ForOneHour * hours;
        double volumeForHours = volumeForHoursP1 + volumeForHoursP2;


        if (volumeForHours <= volumeInLiters) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", volumeForHours/volumeInLiters * 100,
                    volumeForHoursP1 / volumeForHours * 100, volumeForHoursP2 / volumeForHours * 100);
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(volumeInLiters - volumeForHours) );
        }


    }
}
