package Replit_String;

import java.util.Scanner;

/*
Use `String methods` to verify if the given `sentence` contains the given `word`.
The values of `sentence` and `word` will be inputs from a Scanner, but you only need to interact with the String variables.
Output a `boolean value, true or false`.

Ex:
  Input:
    Word: AirPods
    Sentence: Did you just get some AirPods for Christmas?

  Output:
    true
 */
public class VerifyContains {
    public static void main(String[] args) {
        //Do NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW

        boolean hasWord = sentence.contains(word);
        System.out.println(hasWord);

        scan.close();

    }

}
