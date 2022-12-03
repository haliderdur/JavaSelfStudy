package SelfStudy.WrapperClassesPractise;

import java.util.Arrays;

/*
2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
The method swaps the element at index i with the element at index j, and returns the new array
        Ex:
        arr = {10, 20, 30, 40, 50};
        swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
2.2 Create the same function for double array, char array and string array
 */
public class SwapTask {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        arr = swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        String[] arrS = {"Lisbon", "Hamburg", "Barcelona", "Roma", "London", "NewYork"};
        arrS = swap(arrS, 1, 5);
        System.out.println(Arrays.toString(arrS));
    }

    public static int[] swap(int[] array, int index1, int index2) {
        int[] result = new int[array.length];

        if (index1 > array.length || index2 > array.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        int i = 0;
        for (int each : array) {
            result[i] = each;
            if (array[i] == array[index1]) {
                result[index1] = array[index2];
            } else if (array[i] == array[index2]) {
                result[index2] = array[index1];
            }
            i++;
        }
        return result;

    }

    public static double[] swap(double[] array, int index1, int index2) {
        double[] result = new double[array.length];

        if (index1 > array.length || index2 > array.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        int i = 0;
        for (double each : array) {
            result[i] = each;
            if (array[i] == array[index1]) {
                result[index1] = array[index2];
            } else if (array[i] == array[index2]) {
                result[index2] = array[index1];
            }
            i++;
        }
        return result;
    }

    public static char[] swap(char[] array, int index1, int index2) {
        char[] result = new char[array.length];

        if (index1 > array.length || index2 > array.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        int i = 0;
        for (char each : array) {
            result[i] = each;
            if (array[i] == array[index1]) {
                result[index1] = array[index2];
            } else if (array[i] == array[index2]) {
                result[index2] = array[index1];
            }
            i++;
        }
        return result;
    }

    public static String[] swap(String[] array, int index1, int index2) {
        String[] result = new String[array.length];

        if (index1 > array.length || index2 > array.length) {
            System.err.println("Invalid index");
            System.exit(0);
        }

        int i = 0;
        for (String each : array) {
            result[i] = each;
            if (array[i].equals(array[index1])) {
                result[index1] = array[index2];
            } else if (array[i].equals(array[index2])) {
                result[index2] = array[index1];
            }
            i++;
        }
        return result;
    }


}
