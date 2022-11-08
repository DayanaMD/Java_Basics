package Exercise1;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int piecesOfCake = w * h;
        int sum = 0;
        boolean isItDone = true;

        while ( piecesOfCake > 0){

            String command = scanner.nextLine();

            if(command.equals("STOP")){
                isItDone = false;
                break;
            }

            int takenPieces = Integer.parseInt(command);
            piecesOfCake = piecesOfCake - takenPieces;


        }

        if(!isItDone){
            System.out.printf("%d pieces are left.", piecesOfCake);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesOfCake));
        }


    }
}
