package CodingBat.Warmup1;

public class reverseString {

    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed += ch;
        }
        System.out.println(reversed);
        return reversed;
    }

    public static void main(String[] args) {

        // with method
        String str = "Lena";
        reverseString obj = new reverseString();
        obj.reverse(str);


        // with String literal
        String str1 = "Yasir";
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            char ch = str1.charAt(i);
            reversed += ch;
        }
        System.out.println(reversed);


        // with StringBuffer
        StringBuffer str2 = new StringBuffer("Halid");
        str2.reverse();
/*
        for (int i = str2.length() - 1; i >= 0; i--) {
            char ch = str2.charAt(i);
            str2.deleteCharAt(i);
            str2.append(ch);
        }
*/
        System.out.println(str2);


        // with StringBuilder
        StringBuilder str3 = new StringBuilder("Kubra");
        for (int i = str3.length() - 1; i >= 0; i--) {
            char ch = str3.charAt(i);
            str3.deleteCharAt(i);
            str3.append(ch);
        }
        System.out.println(str3);
    }
}
