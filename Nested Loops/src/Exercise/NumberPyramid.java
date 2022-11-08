package Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean itIsBigger = false;

        for (int rows = 1; rows <= num; rows++) {
            for (int col = 1; col <= rows; col++) {
                if(current > num){
                    itIsBigger = true;
                    break;
                }


                System.out.print(current + " ");
                current++;
            }

            if (itIsBigger){
                break;
            }



            System.out.println();
        }

    }
}
