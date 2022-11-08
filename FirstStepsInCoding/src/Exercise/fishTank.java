package Exercise;

import java.util.Scanner;

public class fishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentBusy = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double volumeLiters = volume * 0.001;

        double volumeFree =(volumeLiters - ( volumeLiters * percentBusy / 100.0))  ;

        System.out.println(volumeFree);

    }
}
