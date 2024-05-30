package Replit.Replit_String;

/* Given a sentence which is ended with "." included letters, numbers, special charecters and then find hidden sentence.
    input:
         String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&
         t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
    output:
         You are the best guys
 */
public class HiddenSentence {
    public static void main(String[] args) {

        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        String temp = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (65 <= sentence.charAt(i) && sentence.charAt(i) <= 90) {
                temp += sentence.charAt(i);
            } else if (97 <= sentence.charAt(i) && sentence.charAt(i) <= 122) {
                temp += sentence.charAt(i);
            } else if (sentence.charAt(i) == ' ') {
                temp += " ";
            } else if (sentence.charAt(i) == '.') {
                break;
            } else {
                continue;
            }
        }

        System.out.println(temp);


        String sentence2 = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        StringBuilder temp2 = new StringBuilder();

        for (int i = 0; i < sentence2.length(); i++) {
            char currentChar = sentence2.charAt(i);

            if (Character.isLetter(currentChar)) {
                temp2.append(currentChar);
            } else if (currentChar == ' ') {
                temp2.append(' ');
            } else if (currentChar == '.') {
                break;
            }
        }
        System.out.println(temp2);
    }
}
