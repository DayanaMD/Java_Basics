package Lab;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int firstNum = 1;
        for(int i = 0; i <= num; i+=2 ){

            System.out.println(firstNum);
             firstNum = firstNum * 2 * 2;
        }



    }
}
