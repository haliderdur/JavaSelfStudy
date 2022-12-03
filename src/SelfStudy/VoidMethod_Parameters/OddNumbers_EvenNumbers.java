package SelfStudy.VoidMethod_Parameters;

/*
Task1: create a method that can print odd numbers between 1~100 in a same line separated by space
Task2: create a method that can print even numbers between 1~100 in a same line separated by space
 */
public class OddNumbers_EvenNumbers {

    public static void main(String[] args) {
        oddNumbers();

        System.out.println();

        evenNumbers();
    }

    public static void oddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " "); // 1 3 5 7 9....
        }
    }

    public static void evenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }


}
