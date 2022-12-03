package Replit_Loop;
/*
Use a `loop` to count how many times the characters `cat` and `dog` are found in the given String `str`.
Output `true` if `cat` and `dog` appear the same number of times, otherwise output `false`
                Ex:
                  Input:
                         catdog
                  Output:
                         true

                  Input:
                         cat-cheetah-dog-cat
                  Output:
                         false
 */

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (!(str.contains("cat")) || !(str.contains("dog"))) {
            System.out.println("false");
        }
        if (str.contains("cat") && str.contains("dog")) {

            int catFrequency = 0;
            int dogFrequency = 0;

            while (str.contains("cat")) {
                str = str.replaceFirst("cat", "");
                catFrequency++;
            }
            while (str.contains("dog")) {
                str = str.replaceFirst("dog", "");
                dogFrequency++;
            }
            if (catFrequency == dogFrequency) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scan.close();
    }


}

