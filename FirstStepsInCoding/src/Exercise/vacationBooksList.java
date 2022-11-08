package Exercise;

import java.util.Scanner;

public class vacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesOneHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursOfReading = pagesCurrentBook / pagesOneHour;
        int hoursPerDay = hoursOfReading / days;

        System.out.println(hoursPerDay);
    }
}
