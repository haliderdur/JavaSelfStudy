package SelfStudy.WrapperClassesPractise;

import java.util.Arrays;

/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
The method inserts the given element to the given index of the array and returns the new array
            Ex:
            arr = {10, 20, 30, 40, 50};
            insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
1.2 Create the same function for double array, char array and string array
 */
public class InsertTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        arr = insert(arr, 4, 15);
        System.out.println(Arrays.toString(arr));

        double[] arrD = {1.5, 2.5, 5.7, 9.8};
        arrD = insert(arrD, 2, 3.7);
        System.out.println(Arrays.toString(arrD));

        String[] arrS = {"Halid","Akif","Fatih","Sema"};
        arrS = insert(arrS,3,"Jack");
        System.out.println(Arrays.toString(arrS));
    }

    public static int[] insert(int[] array, int index, int element) {

        int[] result = new int[array.length + 1];

        if (index > result.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else if (i == index) {
                result[index] = element;
            } else if (i > index) {
                result[i] = array[i - 1];
            }
        }

        return result;


    }

    public static double[] insert(double[] array, int index, double element) {

        double[] result = new double[array.length + 1];

        if (index > result.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else if (i == index) {
                result[index] = element;
            } else if (i > index) {
                result[i] = array[i - 1];
            }
        }

        return result;


    }

    public static char[] insert(char[] array, int index, char element) {

        char[] result = new char[array.length + 1];

        if (index > result.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else if (i == index) {
                result[index] = element;
            } else if (i > index) {
                result[i] = array[i - 1];
            }
        }

        return result;


    }

    public static String[] insert(String[] array, int index, String element) {

        String[] result = new String[array.length + 1];

        if (index > result.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else if (i == index) {
                result[index] = element;
            } else if (i > index) {
                result[i] = array[i - 1];
            }
        }

        return result;


    }
}
