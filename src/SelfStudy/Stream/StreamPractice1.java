package SelfStudy.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice1 {

    public static void main(String[] args) {

        // 1. Write a program that can remove the duplicated elements of an array of String

        String[] str1 = {"Bayern Munchen", "Galatasaray", "Barcelona", "Real Madrid", "Galatasaray",
                "Chelsea", "Galatasaray", "Milan", "PSG", "Benfica", "Real Madrid", "Bayern Munchen", "Arsenal", "PSG"};

        Object[] str2 = Arrays.stream(str1).distinct().toArray();

        System.out.println(Arrays.toString(str2));


        // 2. Write a program that can remove the duplicated elements of a List of String

        List<String> list1 = new ArrayList<>(Arrays.asList("Bayern Munchen", "Galatasaray", "Barcelona", "Real Madrid", "Galatasaray",
                "Chelsea", "Galatasaray", "Milan", "PSG", "Benfica", "Real Madrid", "Bayern Munchen", "Arsenal", "PSG"));

        list1 = list1.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);


        // 3. Write a program that can count how many "java" and "python" does the array has:

        String[] arr2 = {"Java", "python", "java", "PYthon", "JAva", "JAVA"};

        long countJava = Arrays.stream(arr2).filter(p -> p.equalsIgnoreCase("java")).count();

        long countPython = Arrays.stream(arr2).filter(p -> p.equalsIgnoreCase("python")).count();

        System.out.println("java: " + countJava);
        System.out.println("python: " + countPython);


        // 4. Write a program that can count how many negative and positive numbers does the array has
        int[] arr3 = {1, 2, 3, 4, -4, 5, -5};

        long countNegative = Arrays.stream(arr3).filter(p -> p < 0).count();
        long countPositive = Arrays.stream(arr3).filter(p -> p > 0).count();

        System.out.println(countNegative);
        System.out.println(countPositive);

        //5. Write a program that can return all the negative and positive numbers of the array as a new array

        int[] arr4 = {1, 2, 3, 4, -4, 5, -5, 7, -9};

        int[] arr5 = Arrays.stream(arr4).filter(p -> p < 0).toArray();
        int[] arr6 = Arrays.stream(arr4).filter(p -> p > 0).toArray();

        System.out.println("Negatives: " + Arrays.toString(arr5));
        System.out.println("Positives: " + Arrays.toString(arr6));


        // 5. Write a program that can return all the positive numbers of List without the duplcaites
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4));

        list2 = list2.stream().distinct().filter(p -> p > 0).collect(Collectors.toList());

        System.out.println(list2);


        // Write a program that can return the palindrome Strings from a list:

        List<String> list3 = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon", "racecar", "python"));

/*
        List<String> list5 = new ArrayList<>();

        for (String each : list3) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += "" + each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)) {
                list5.add(each);
            }
        }
        System.out.println(list5);
 */
        // list3 = list3.stream().filter(p -> p.equalsIgnoreCase(p.)).collect(Collectors.toList());
        System.out.println(list3);


    }
}
