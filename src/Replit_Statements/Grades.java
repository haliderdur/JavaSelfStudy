package Replit_Statements;

import java.util.Scanner;

/*
    Use `if statements` to determine if the given `int` `grade` is a passing grade.
        Use the following ranges to determine the result:
            > - if the grade is bigger than or equals to `90` output `excellent`
            > - if the grade is bigger than or equals to `70` and smaller than `90` output `good`
            > - if the grade is bigger than or equals to `60` and smaller than `70` output `pass`
            > - if the grade is smaller than `60` output `fail`
 */
public class Grades {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        boolean validGrade = grade <= 100 && grade >= 0;

        if (validGrade) {
            if (grade >= 90) {
                System.out.println("excellent");
            } else if (grade < 90 && grade >= 70) {
                System.out.println("good");
            } else if (grade < 70 && grade >= 60) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
