package Replit.Replit_Loop;
/*
Use a `loop` to count how many times the characters `java` and `python` are found in the given String `sentence`.
Output `true` if `java` and `python` appear the same number of times, otherwise output `false`.

Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
        Ex:
          Input:
                We study java not python
          Output:
              true
        Ex:
          Input:
                What's the difference between java, javascript and python?

          Output:
                false
       -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.

 */

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaFrequency = 0;
        int pythonFrequency = 0;

        if (!(sentence.contains("java")) && !(sentence.contains("python"))) {
            System.out.println("true");
            System.exit(0);
        }
        if (sentence.contains("java") && sentence.contains("python")) {
            while (sentence.contains("java")) {
                sentence = sentence.replaceFirst("java", "");
                javaFrequency++; // 1 2
            }
            while (sentence.contains("python")) {
                sentence = sentence.replaceFirst("python", "");
                pythonFrequency++; // 1
            }
            if (javaFrequency == pythonFrequency) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}
