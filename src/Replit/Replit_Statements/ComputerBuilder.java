package Replit.Replit_Statements;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        scan.nextLine();

        System.out.println("Select CPU type:");
        String CPUType = scan.nextLine();

        System.out.println("Select RAM size:");
        int RAMsize = scan.nextInt();
        scan.nextLine();

        System.out.println("Select storage type:");
        String storageType = scan.nextLine().toUpperCase();

        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        scan.nextLine();

        System.out.println("Select screen resolution:");
        String screenResolution = scan.nextLine().toUpperCase();

        double price = 0;

        if (screenSize == 13.3) {
            price = price + 200;
        } else if (screenSize == 15.0) {
            price = price + 300;
        } else if (screenSize == 17.3) {
            price = price + 400;
        }
        if (CPUType.equals("i3")) {
            price = price + 150;
        } else if (CPUType.equals("i5")) {
            price = price + 250;
        } else if (CPUType.equals("i7")) {
            price = price + 350;
        }
        if (RAMsize % 4 == 0) {
            price = price + ((RAMsize / 4) * 50);
        }
        if (storageType.equals("HDD")) {
            price = price + ((storageSize / 500) * 50);
        } else if (storageType.equals("SSD")) {
            price = price + ((storageSize / 500) * 100);
        }
        if (screenResolution.equals("FULLHD")) {
            price = price + 100;
        } else if (screenResolution.equals("4K")) {
            price = price + 200;
        }

        System.out.println("Final price is: $" + price);

        scan.close();
    }
}
