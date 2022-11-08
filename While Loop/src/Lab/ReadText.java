package Lab;

import java.util.Scanner;

public class ReadText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {

            System.out.printf("%n%s", command);

            command = scanner.nextLine();

        }
    }
}
