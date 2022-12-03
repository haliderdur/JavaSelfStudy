package Replit_String;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String bread = "bread";
        // 01234
        char b = bread.charAt(0);
        char d = bread.charAt(4);

        if (!(str.contains("bread"))) {
            System.out.println("nothing");
        } else {
            System.out.println("nothing");
        }
        if (str.contains("bread")) {
            if (str.startsWith("bread") && str.endsWith("bread")) {
                System.out.println(str.substring(bread.indexOf("d") + 1, str.lastIndexOf("b")));
            }
            if ((str.startsWith("bread")) || (!(str.endsWith("bread")))) {
                if (!(str.substring(5, str.lastIndexOf(0)).contains("bread"))) {
                    System.out.println("nothing");
                }
                if ((str.substring(5, str.lastIndexOf(0)).contains("bread"))) {
                    System.out.println(str.substring(str.indexOf(d) + 1, str.lastIndexOf(b)));
                }
            }
        }


    }

}


