package SelfStudy.VoidMethod_Parameters;

/*
Task: create a method named printEachChar that can print each character of a string
 */
public class printEachChar {
    public static void main(String[] args) {
        printEachChar("TARIK");
    }

    public static String printEachChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) { // TARIK
            char ch = str.charAt(i);
            result = "" + ch;
            System.out.println(result);
        }
        return result;
    }


}
