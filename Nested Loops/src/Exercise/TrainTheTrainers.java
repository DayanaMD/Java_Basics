package Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double totalSum = 0;
        int totalAssessments = 0;

        while(!command.equals("Finish")){
            String presentation = command;


            double sum = 0;


            for( int i = 1; i <= jury; i++){

                double assessmentNum =  Double.parseDouble(scanner.nextLine());

                sum = sum + assessmentNum;

                totalAssessments++;



            }
            double average = sum / jury;
            totalSum = totalSum + sum;


            System.out.printf("%s - %.2f.%n", presentation, average);

            command = scanner.nextLine();


        }

        double averageTotal = totalSum /totalAssessments++;

        System.out.printf("Student's final assessment is %.2f.", averageTotal);



    }
}
