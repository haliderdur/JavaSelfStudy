package SelfStudy.WrapperClassesPractise;

/*
Write program that returns true if the total number of upper case characters are equal
to total number of Lowercase characters of a string
            Ex:
                 str = "JAVA java";
            output:
                 true
 */
public class UpperCaseLowerCaseEqual {
    public static void main(String[] args) {

        String str = "JAVA java java JAVA JAVa Java";

        boolean result = isUpperLowerEquals(str);
        System.out.println(result);
    }

    public static boolean isUpperLowerEquals(String str) {

        boolean result = false;
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean upperCase = str.charAt(i) >= 'A' && str.charAt(i) <= 'Z';
            boolean lowerCase = str.charAt(i) >= 'a' && str.charAt(i) <= 'z';

            if (upperCase) {
                countUpper++;
            } else if (lowerCase) {
                countLower++;
            }
        }
        if (countUpper == countLower) {
            result = true;
        }
        return result;
    }
}
