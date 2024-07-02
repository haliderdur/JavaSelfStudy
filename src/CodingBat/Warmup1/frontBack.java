package CodingBat.Warmup1;

public class frontBack {

    /*
       Given a string, return a new string where the first and last chars have been exchanged.

       frontBack("code") → "eodc"
       frontBack("a") → "a"
       frontBack("ab") → "ba"
     */
    public String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        } else {
            char strLastChar = str.charAt(str.length() - 1);
            char strFirstChar = str.charAt(0);
            String mid = str.substring(1, str.length() - 1);
            String result = strLastChar + mid + strFirstChar;
            return result;
        }
    }

    public static void main(String[] args) {
        frontBack frontBack = new frontBack();
        String str = frontBack.frontBack("Kubra");
        System.out.println(str);
    }

}
