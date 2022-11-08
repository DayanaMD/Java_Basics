package Lab;

import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsNum = Integer.parseInt(scanner.nextLine());

        int hour = projectsNum * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hour, projectsNum);
    }
}
