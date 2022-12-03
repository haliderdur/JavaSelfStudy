package Replit_Statements;

import java.util.Scanner;

/*
    SDET Motors Inc. is recalling all vehicles from model years:
         > - 1995-1998,
         > - 2001-2002,
         > - 2004-2006,
         > - 2015-2017

    Given the `vehicleYear` determine if the vehicle is being recalled or not
        > If the year is from included in the recall year list print:
          `Your vehicle needs to be recalled!`
        > If the year is not one of the recall years print:
        `Your vehicle is fine, enjoy!`
 */
public class VehicleRecall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vehicleYear = input.nextInt();

        String result = "";

        if (vehicleYear >= 1995 && vehicleYear <= 1998 || vehicleYear >= 2001 && vehicleYear <= 2002
                || vehicleYear >= 2004 && vehicleYear <= 2006 || vehicleYear >= 2015 && vehicleYear <= 2017) {
            result = "Your vehicle needs to be recalled!";
        } else {
            result = "Your vehicle is fine, enjoy!";
        }
        System.out.println(result);

        input.close();

    }
}
