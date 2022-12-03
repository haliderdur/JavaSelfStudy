package Replit_Statements;

/*
 Use a `switch statement` to display the day of the week when given an `int` `day`.
 If an invalid `day` is given print `Not a valid day`.

        The starting day will be 1, as Monday and the ending day will be 7, as Sunday.
            Ex:
              Enter day number:
              1
              Monday
 */

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        String result = "";

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Not a valid day";

        }
        System.out.println(result);
        scan.close();


    }
}
