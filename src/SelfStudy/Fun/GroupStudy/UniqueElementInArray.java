package SelfStudy.Fun.GroupStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementInArray {

    public static void main(String[] args) {


        String[] arr1 = {"Lisbon", "Barcelona", "Berlin", "Paris", "Barcelona", "London", "Washington", "London", "Berlin"};

        for (int i = 0; i < arr1.length; i++) {
            String element = arr1[i];
            int frequency = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (element.equals(arr1[j])) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }

        /*
        for (String each : arr1) {
            if(Collections.frequency(new ArrayList<>(Arrays.asList(arr1)), each) == 1){
                System.out.println(each);
            }
        }

         */
    }

}
