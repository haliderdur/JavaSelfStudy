package Replit.Replit_Statements;

/*
    Use `if statements` to help the student find out which grade level they will join based on their `age`.
    Use the following information to determine the results:

            less than 3   -> ineligible
            3-4           -> preschool
            5             -> kindergarten
            6-10          -> elementary school
            11-13         -> middle school
            14-18         -> high school
            19+           -> college
 */

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        String result = "";

        if (age >= 3 && age <= 4) {
            result = "preschool";

        } else if (age == 5) {
            result = "kindergarten";

        } else if (age >= 6 && age <= 10) {
            result = "elementary school";

        } else if (age >= 11 && age <= 13) {
            result = "middle school";

        } else if (age >= 14 && age <= 18) {
            result = "high school";

        } else if (age > 18) {
            result = "college";

        } else {
            result = "ineligible";
        }
        System.out.println(result);

        input.close();

    }
}
