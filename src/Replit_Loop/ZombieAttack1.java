package Replit_Loop;

import java.util.Scanner;

public class ZombieAttack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;
        if (inhabitants == 0) {
            System.out.println("---- EXTINCT ----");
        } else {

            System.out.println("Day " + day + " [" + inhabitants + "]");
            while (inhabitants > 1) {
                inhabitants = inhabitants / 2;
                day++;
                System.out.println("Day " + day + " [" + inhabitants + "]");
            }
            System.out.println("---- EXTINCT ----");
        }
        scan.close();
    }
}

