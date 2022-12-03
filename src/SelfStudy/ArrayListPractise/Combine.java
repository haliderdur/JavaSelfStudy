package SelfStudy.ArrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;

/*
write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class Combine {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.addAll(Arrays.asList("A", "B", "C"));
        list2.addAll(Arrays.asList("D", "E", "F", "G"));

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<String> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);

        System.out.println(combinedList);


    }
}
