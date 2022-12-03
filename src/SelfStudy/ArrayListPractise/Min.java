package SelfStudy.ArrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a program that can find the minimum number from an ArrayList of integers
    Ex:
        list = [1,2,3,4,5];
    output:
        1
 */
public class Min {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        int min = Collections.min(list);
        System.out.println(min);
    }


}
