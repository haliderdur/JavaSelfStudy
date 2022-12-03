package Replit_String;
/*
Use `String methods` to print the first half of the given `word`, twice. Find the beginning half of the String and concatenation it twice.

        Ex:
          Input:
            java

          Output:
            jaja

        Ex:
          Input:
            unity

          Output:
            unun
 */

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int a = word.indexOf(word.charAt(0));   // kelimenin indexOf unu al --> charAt ile sifirinci char olarak belirle. java = 0123
        int b = word.length();  //  kelimenin uzunlugu

        word = word.substring(a, b / 2);  // substring ile baslangic ve bitis indexlerini belirle JAVA --> a=JA [beginning index] , b=JAVA/2[ending index]
        System.out.println(word + word);

        scan.close();
    }
}
