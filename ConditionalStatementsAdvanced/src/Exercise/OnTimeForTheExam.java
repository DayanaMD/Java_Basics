package Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int hourExamInMin = hourExam * 60;
        int totExamMin = hourExamInMin + minExam;

        int hourArrivalInMin = hourArrival * 60;
        int totArrivalMin = hourArrivalInMin + minArrival;

        int diffExamArrival = totExamMin - totArrivalMin;

//        570
//        590

        if (diffExamArrival < 0) {

            System.out.println("Late");
            if (Math.abs(diffExamArrival) < 60) {
                System.out.printf("%d minutes after the start", Math.abs(diffExamArrival));
            } else {
                System.out.printf("%d:%02d hours after the start",
                        (Math.abs(diffExamArrival) / 60), Math.abs(diffExamArrival) % 60);
            }
        } else if (diffExamArrival == 0) {

            System.out.println("On time");

        } else if (diffExamArrival > 0 && diffExamArrival <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(diffExamArrival));


        } else {
            System.out.println("Early");
            if (Math.abs(diffExamArrival) < 60) {
                System.out.printf("%d minutes before the start", Math.abs(diffExamArrival));


            } else {

                System.out.printf("%d:%02d hours before the start",
                        (Math.abs(diffExamArrival) / 60), Math.abs(diffExamArrival) % 60);
            }
        }
    }


}

