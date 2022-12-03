package Replit_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        double total = 0;
        double averageTemp = 0;

        for (double each : temps) {
            total += each;
            averageTemp = total / temps.length;
        }
        System.out.println(averageTemp);

        scan.close();
    }
}
