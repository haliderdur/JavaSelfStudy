package SelfStudy.Fun.GroupStudy;

public class Palindrome {


    public static void main(String[] args) {


        String str = "CIVIC";

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        boolean isPalindrome = result.equalsIgnoreCase(str);
        if (isPalindrome) {
            System.out.println(result);
        }

        String[] arr1 = {"civic", "anna", "halid", "Ismail", "level"};

        for (String each : arr1) {
            String temp = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                temp += each.charAt(i);
            }
            if (temp.equalsIgnoreCase(each)) {
                System.out.println(temp);
            }
        }


    }

}
