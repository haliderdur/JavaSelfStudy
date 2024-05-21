package SelfStudy.Fun.GroupStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5};

        Integer[] result = new Integer[arr1.length];

        int index = arr1.length - 1;

        for (Integer each : arr1) {

            result[index] = each;
            index--;

        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------");

        ArrayList<Object> list;
        list = new ArrayList<>(Arrays.asList(result));

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);
        //System.out.println(Arrays.toString(result));


    }
}
