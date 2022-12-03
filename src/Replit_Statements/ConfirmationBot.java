package Replit_Statements;
/*
  Use a `switch statement` to create a confirmation bot.
    Given a `response` value as a `char`, output a message based on the following:
        > - if the response is `y` print the message: `Your request is being processed`
        > - if the response is `n` print the message: `Thank you for your consideration`
        > - if the response is `h` print the message: `Sorry, no live agents are currently available`
        > - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`
                      Ex:
                          Enter command:
                          y
                          Your request is being processed
 */

import java.util.Scanner;

public class ConfirmationBot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        String result = "";
/*
        if (response == 'y') {
            result = "Your request is being processed";
        } else if (response == 'n') {
            result = "Thank you for your consideration";
        } else if (response == 'h') {
            result = "Sorry, no live agents are currently available";
        } else {
            result = "Invalid entry, please try again";
        }
        System.out.println(result);

 */
        switch (response) {
            case 'y':
                result = "Your request is being processed";
                break;
            case 'n':
                result = "Thank you for your consideration";
                break;
            case 'h':
                result = "Sorry, no live agents are currently available";
                break;
            default: {
                result = "Invalid entry, please try again";
            }
        }
        System.out.println(result);

        scan.close();

    }
}
