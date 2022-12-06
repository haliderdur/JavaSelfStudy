package Replit.Replit_Statements;

/*
Android is one of the popular mobile operating systems. The versions in android systems follow names related to sweets.
You will need to take the given `version` value to output the name of the current version.
Use the following chart to determine the versions:

    Note: The `version` will be given as a `String`

        **Versions**
        > - 1.5 - Cupcake
        > - 1.6 - Donut
        > - 2.1 - Eclair
        > - 2.2 - Froyo
        > - 2.3 - Gingerbread
        > - 3.1 - Honeycomb
        > - 4.0 - Ice Cream Sandwich
        > - 4.1 - Jelly Bean
        > - 4.4 - KitKat
        > - 5.0 - Lollipop
        > - 8.0 - Oreo
        > - 9.0 - Pie
        > - Any other number is invalid and should display: Not a valid version

    Note: It's possible to use if statements to complete this, but use switch statement for practice.
    Or for even more practice, complete the task twice, once using each different conditional statement.

                   Ex:
                      Input:
                            9.0
                      Output:
                            Pie
*/

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        String result = "";

        switch (version) {
            case "1.5":
                result = "Cupcake";
                break;
            case "1.6":
                result = "Donut";
                break;
            case "2.1":
                result = "Eclair";
                break;
            case "2.2":
                result = "Froyo";
                break;
            case "2.3":
                result = "Gingerbread";
                break;
            case "3.1":
                result = "Honeycomb";
                break;
            case "4.0":
                result = "Ice Cream Sandwich";
                break;
            case "4.1":
                result = "Jelly Bean";
                break;
            case "4.4":
                result = "KitKat";
                break;
            case "5.0":
                result = "Lollipop";
                break;
            case "8.0":
                result = "Oreo";
                break;
            case "9.0":
                result = "Pie";
                break;
            default:
                result = "Not a valid version";
        }
        System.out.println(result);
        input.close();

    }


}
