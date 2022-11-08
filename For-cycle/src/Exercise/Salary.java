package Exercise;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean IsLostSalary = false;

        int currentSalary = 0;

        for (int i = 1; i <= openTabs; i++) {

            String site = scanner.nextLine();
            switch (site) {

                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;


            }
            currentSalary = salary;

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                IsLostSalary = true;
                break;
            }


        }

        if (!IsLostSalary) {
            System.out.println(currentSalary);
        }



    }
}
