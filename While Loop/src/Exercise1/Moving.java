package Exercise1;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int space = w * l * h;

        String command = scanner.nextLine();
        int sumBoxes = 0;
        boolean isItFull = false;

        while(!command.equals("Done")){

            int boxes = Integer.parseInt(command);
            sumBoxes = sumBoxes + boxes;

            if(sumBoxes >= space){
                isItFull = true;

                break;
            }
            command = scanner.nextLine();


        }
        if(!isItFull){
            System.out.printf("%d Cubic meters left.", space - sumBoxes);
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.", sumBoxes - space);
        }



    }
}
