package SelfStudy.ArrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Write a program that can find the maximum number from an ArrayList of  integers
    Ex:
      list = [1,2,3,4,5];
    output:
      5
 */
public class Max {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        int max = Collections.max(list);
        System.out.println(max);
    }
}
