package Replit.Replit_Statements;

import java.util.Scanner;

/*
Use a `switch statement` to display the month name when given an `int` `monthNum`.
If an invalid `monthNum` is given print `Invalid month number`
         Ex1:
              Enter month number:
              5
              May
         Ex2:
              Enter month number:
              20
              Invalid month number
 */
public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();

        String result = "";

        //    if (monthNum >= 1 && monthNum <= 12) {
        switch (monthNum) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid month number";
        }
        /* } else {
                 result = "Invalid month number";
           }
         */
        System.out.println(result);

        scan.close();
    }
}
