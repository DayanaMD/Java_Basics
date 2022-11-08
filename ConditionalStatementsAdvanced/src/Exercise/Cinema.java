package Exercise;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;

        switch (projection) {

            case "Premiere":
                totalPrice = r * c * 12.00;
                break;
            case "Normal":
                totalPrice = r * c * 7.50;
                break;
            case "Discount":
                totalPrice = r * c * 5.00;
                break;

        }

        System.out.printf("%.2f", totalPrice);
    }
}
