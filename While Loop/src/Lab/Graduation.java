package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        double sum = 0.00;
        int countPoorGrade = 0;
        int countAllYears = 1;
        boolean itIsGraduated = true;

        while (countAllYears <= 12) {

            if (countPoorGrade > 1 ) {
                System.out.printf("%s has been excluded at %d grade", name, countAllYears);
                itIsGraduated = false;
                break;
            }
            double grades = Double.parseDouble(scanner.nextLine());

            if (grades < 4) {
                countPoorGrade++;
                continue;
            }




            sum = sum + grades;


            countAllYears++;


        }
        double averageGrade = sum / 12;

        if (itIsGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
