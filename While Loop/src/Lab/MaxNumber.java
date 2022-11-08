package Lab;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        int number = Integer.MIN_VALUE;

        while(!command.equals("Stop")){

            int enteredNum = Integer.parseInt(command);

            if(enteredNum > number){
                number = enteredNum;
            }

            command = scanner.nextLine();

        }
        System.out.println(number);
    }
}
