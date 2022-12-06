package Replit.Replit_Loop;
/*
Use a `loop` to count the number of triples in the given `str`.
A triple is when the same character appears three times in a row.
So if there is a specific character that is repeated three times, that will be counted as one triple.
Print the total number of triples found in the String.
The triples may overlap.

        Ex:
          Input:
                abcXXXabc
          Output:
                1
     -> the triple is XXX
          Input:
                xxxabyyyycd
          Output:
                3
    -> the triples found are xxx yyy and another yyy

 */

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int tripleCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char eachChar = str.charAt(i);

            if (eachChar == str.charAt(i + 1) && eachChar == str.charAt(i + 2)) {
                tripleCount++;
            }
        }
        System.out.println(tripleCount);
        scan.close();
    }
}
