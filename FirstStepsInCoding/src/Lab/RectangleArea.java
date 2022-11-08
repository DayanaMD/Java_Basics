package Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = Integer.parseInt(number.nextLine());
        int b = Integer.parseInt(number.nextLine());
        int area = a * b;
        System.out.println(area);

    }
}
