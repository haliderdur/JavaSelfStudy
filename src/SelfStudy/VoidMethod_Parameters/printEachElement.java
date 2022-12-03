package SelfStudy.VoidMethod_Parameters;
/*
Task:  create a method named printEachElement that can print each elements of an integer array
 */
public class printEachElement {
    public static void main(String[] args) {
        printEachElement();
    }

    public static void printEachElement() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int each : numbers) {
            System.out.print(each + " ");
        }

    }
}
