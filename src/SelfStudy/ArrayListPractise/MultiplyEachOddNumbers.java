package SelfStudy.ArrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;

/*
write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */
public class MultiplyEachOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 != 0) {
                list.set(i, element * 2);
            }
        }
        System.out.println(list);

    }
}
