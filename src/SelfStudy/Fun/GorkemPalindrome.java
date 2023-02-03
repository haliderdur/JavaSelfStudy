package SelfStudy.Fun;

public class GorkemPalindrome {

    public static void main(String[] args) {

        String str = "LeVel PytHON JaVa rACecar html seleNIUm loREm iPsum";

        String[] array = str.split(" ");
        String reversedEach = "";
        int count = 0;

        for (String each : array) {

            for (int i = each.length() - 1; i >= 0; i--) {
                reversedEach += each.charAt(i);
            }
            if (reversedEach.equalsIgnoreCase(each)) {
                System.out.println(each);
                count++;
            }
            reversedEach = "";
        }
        System.out.println(count);
    }
}
