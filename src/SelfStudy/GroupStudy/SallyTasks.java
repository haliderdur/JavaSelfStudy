package SelfStudy.GroupStudy;

public class SallyTasks {
    public static void main(String[] args) {

        String a = "* ";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        oddOrEven(17);

        System.out.println("--------------------");

        reverse("Wooden Spoon");

        System.out.println("--------------------");

        palindrome("Anna");


    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);
        }
        System.out.println(result);
        return result;
    }

    public static String palindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
        return reverse;
    }


}
