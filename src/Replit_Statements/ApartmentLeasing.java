package Replit_Statements;

/*
 Use `if statements` to find the cost of leasing an apartment based on the number of bedrooms.
 Use the `numberOfBedrooms` variable and these rates to get the final price:

> - 1 bedroom: 1100
> - 2 bedroom: 1850
> - 3 bedroom: 2550

 Note: If an invalid bedroom number is given no price is displayed
 */

import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cydeo Apartments!\n" +
                "How many bedrooms are you looking for?");

        int numberOfBedrooms = scan.nextInt();
        int bedroom1 = 1100;
        int bedroom2 = 1850;
        int bedroom3 = 2550;

        String result = "";

        if (numberOfBedrooms == 1) {
            System.out.println("One Bedroom Selected");
            result = "Starting Price: " + bedroom1;
        } else if (numberOfBedrooms == 2) {
            System.out.println("Two Bedroom Selected");
            result = "Starting Price: " + bedroom2;
        } else if (numberOfBedrooms == 3) {
            System.out.println("Three Bedroom Selected");
            result = "Starting Price: " + bedroom3;
        } else {
            result = "Sorry, we do not offer that many bedrooms";
        }
        System.out.println(result);

        scan.close();
    }
}
