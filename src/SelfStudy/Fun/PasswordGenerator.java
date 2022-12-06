package SelfStudy.Fun;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        System.out.println("Enter your password length:");
        Scanner scan = new Scanner(System.in);
        System.out.println(generatePassword(scan.nextInt()));
    }

    static char[] generatePassword(int length) {

        System.out.println("Your Password:");
        String charsLower = "abcdefghijklmnopqrstuvwxyz";
        String charsUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsLower + charsUpper + nums + symbols;
        Random rnd = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));

        }
        return password;
    }

}
