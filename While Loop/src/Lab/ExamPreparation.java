package Lab;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfApprovedMistakes = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        double sum = 0.00;
        int numberMistakes = 0;
        int numberOfProblems = 0;
        boolean isItEnough = true;
        String lastProblem = "";

        while (!command.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                numberMistakes++;
            }
            if (numberMistakes >= numberOfApprovedMistakes) {
                isItEnough = false;
                break;
            }
            sum = sum + grade;

            numberOfProblems++;
            lastProblem = command;
            command = scanner.nextLine();


        }
        double average = sum / numberOfProblems;

        if(isItEnough){
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n",numberOfProblems );
            System.out.printf("Last problem: %s", lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.",numberOfApprovedMistakes );
        }


    }
}
