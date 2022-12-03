package Replit_String;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        char underScore = (char) email.indexOf('_');
        char a = (char) email.indexOf('@');
        char dot = (char) email.indexOf('.');

        String firstName = email.substring(0, underScore);
        String lastName = email.substring(underScore + 1, a);
        String domain = email.substring(a + 1, dot);

        String chFirstName = "" + firstName.toUpperCase().charAt(0);
        String chLastname = "" + lastName.charAt(0);
        String chDomain = "" + domain.charAt(0);

        System.out.println("First name: " + chFirstName.toUpperCase() + firstName.substring(1));
        System.out.println("Last name: " + chLastname.toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + chDomain.toUpperCase() + domain.substring(1));

    }
}
