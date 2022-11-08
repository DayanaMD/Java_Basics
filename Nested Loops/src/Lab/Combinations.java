package Lab;

import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int countValid = 0;

        for (int i = 0; i <= num; i++){
            for (int k = 0; k <= num; k++){
                for (int l = 0; l <= num; l++){

                    if( i + k + l == num){
                        countValid++;


                    }
                }
            }
        }

        System.out.println(countValid);

    }
}
