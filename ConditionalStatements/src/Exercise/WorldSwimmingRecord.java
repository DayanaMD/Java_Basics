package Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());


        double timeWoObstacle = distanceInMeters * timeForOneMeter;

        double obstacleTime = Math.floor(distanceInMeters / 15);
        double obstacle = obstacleTime * 12.5;

        double totalTime  =timeWoObstacle + obstacle;


        if (totalTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        }

    }
}
