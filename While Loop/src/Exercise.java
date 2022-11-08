import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String name = scanner.nextLine();

        int countBooks = 0;
        boolean isItFind = false;

        while (!name.equals("No More Books")) {


            if (name.equals(command)) {

                System.out.printf("You checked %d books and found it.", countBooks);
                isItFind = true;
                break;

            }else{
                countBooks++;
            }

            name = scanner.nextLine();

        }
        if (!isItFind) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }


    }
}
