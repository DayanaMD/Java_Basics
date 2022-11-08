package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passName = scanner.nextLine();
        String pass = scanner.nextLine();

        while(true){
            String enteredPass = scanner.nextLine();
            if(enteredPass.equals(pass)){
                break;
            }
        }
        System.out.printf("Welcome %s!", passName);


    }
}
