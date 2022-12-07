package SelfStudy.Fun;

import java.util.Scanner;

public class FindIntersection {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
   //     System.out.print(intersection(s.nextLine()));
    }

    public static String intersection(String[] strArr) {
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (Integer.parseInt(arr1[i]) == Integer.parseInt(arr2[j])) {
                sb.append(arr1[i]);
                sb.append(",");
                i++;
                j++;

            } else if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[j])) {
                j++;

            } else {
                i++;
            }
        }

        String answer = sb.toString();
        if (answer.length() == 0) {
            return "false";
        }
        return answer.substring(0, answer.length() - 1);
    }

}
