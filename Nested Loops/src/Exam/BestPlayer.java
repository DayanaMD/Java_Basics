package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String bestPlayer = "";
        int bestGoal = 0;

        while (!command.equals("END")) {

            String player = command;

            int goals = Integer.parseInt(scanner.nextLine());



            if (goals > bestGoal) {

                bestGoal = goals;
                bestPlayer = player;
            }

            if (goals >= 10) {

                break;
            }

            command = scanner.nextLine();


        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if(bestGoal >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestGoal);
        }else{
            System.out.printf("He has scored %d goals.", bestGoal);
        }


    }
}
