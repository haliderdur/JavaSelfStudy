package SelfStudy.FrankenthalPractices;

public class a {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        /* Ternary

        if   = ?
        else = :
        (condition)?  = if block
        :(condition)? = if else block
        :             = else block
         */

        int max2 = (a > b) ? a : b;

        System.out.println(max2);


        System.out.println("------------------------");

        int score = 68;
        char grade;

        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println(grade);

        // Ternary
        char grade2 = (score > 90) ? 'A'
                : (score >= 80) ? 'B'
                : (score >= 70) ? 'C'
                : (score >= 60) ? 'D'
                : 'E';

        System.out.println(grade2);


    }
}
