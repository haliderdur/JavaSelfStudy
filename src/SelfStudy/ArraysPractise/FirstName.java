package SelfStudy.ArraysPractise;


import java.util.Scanner;

public class FirstName {

    public static void names(String info) {

        String[] name = info.split(" ");
        System.out.println("First name: " + name[0]);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        names(scan.nextLine());

        scan.close();

    }

}
