package Replit_String;

public class gorkemUpperLower {
    public static void main(String[] args) {
        String word = "gorkem";

        String result ="";

        for (int i =0; i <word.length() ; i++)
        {
            String ch ="" + word.charAt(i);
            if(i%2==0)
            {
                result+=ch.toUpperCase();
            }
            else
            {
                result+=ch;
            }
        }
        System.out.println("Answer is :" + result);
    }
}
