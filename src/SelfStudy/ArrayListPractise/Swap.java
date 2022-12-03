package SelfStudy.ArrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
write a program that can swap the first and last elements of an integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
 */
public class Swap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
