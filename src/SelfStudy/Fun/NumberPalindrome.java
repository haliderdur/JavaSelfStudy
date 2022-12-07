package SelfStudy.Fun;

/*
    isPalNum(545)   -> true
    isPalNum(1001)  -> true
    isPalNum(13)    -> false
    isPalNum(33)    -> true
 */

public class NumberPalindrome {

    public static boolean isPalNum(int num) {       // 545

        boolean result = false;

        int copyOfOriginal = num;
        int reversedNumber = 0;
        int remainder;

        while (num > 0) {

            remainder = num % 10;  // get most right number - 5 , 4 , 5

            reversedNumber = (reversedNumber * 10) + remainder;  // multiply by 10 to concat, not to add(plus)

            num = num / 10;   // remove most right number from num.
        }
        if (reversedNumber == copyOfOriginal) {
            result = true;
        }

        System.out.println(copyOfOriginal + " : " + result);
        return result;    // if reversed version and original are equal so it's palindrome
    }


    public static void main(String[] args) {

        isPalNum(545);
        isPalNum(1001);
        isPalNum(13);
        isPalNum(33);

    }
}
