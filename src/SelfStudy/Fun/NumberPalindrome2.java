package SelfStudy.Fun;
/*
    isPalNum(545)   -> true
    isPalNum(1001)  -> true
    isPalNum(13)    -> false
    isPalNum(33)    -> true
 */
public class NumberPalindrome2 {

    public static boolean isPalNum2(int num) {

        boolean result = false;

        String str = num + ""; // 545

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                result = true;
            }

        }
        System.out.println(num + " : " + result);
        return result;
    }

    public static void main(String[] args) {
        isPalNum2(545);
        isPalNum2(1001);
        isPalNum2(13);
        isPalNum2(33);

    }
}
