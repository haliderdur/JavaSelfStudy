package CodingBat.Warmup1;

public class front3 {

    /*
        Given a string, we'll say that the front is the first 3 chars of the string.
        If the string length is less than 3, the front is whatever is there.
        Return a new string which is 3 copies of the front.

        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc"
        front3("k") → "kkk"
     */

    public String front3(String str) {

        String front = "";

        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        return front + front + front;
    }

    public static void main(String[] args) {
        front3 front3 = new front3();
        String str = front3.front3("k");
        System.out.println(str);
    }
}
