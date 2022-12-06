package SelfStudy.VoidMethod_ParametersPractise;

import java.util.Scanner;

/*
Task1: create a method that can calculate the grade of the student based on the score
 */
public class Grade {
    public static void main(String[] args) {
        grade();
    }

    public static void grade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you score:");
        int score = scan.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("invalid score");
        } else if (score > 90) {
            System.out.println("Grade is: A");
        } else if (score >= 80) {
            System.out.println("Grade is: B");
        } else if (score >= 70) {
            System.out.println("Grade is: C");
        } else if (score >= 60) {
            System.out.println("Grade is: D");
        } else {
            System.out.println("Failed");
        }
        scan.close();
    }


}
