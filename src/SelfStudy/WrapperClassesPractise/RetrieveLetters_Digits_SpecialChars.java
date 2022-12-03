package SelfStudy.WrapperClassesPractise;

/*
Write a program that can retrieve the letters, digits and special characters from the string
            Ex:
                    str = "Wooden Spoon!"
            output:
                    letters= "WoodenSpoon";
                    Digits = "123";
                    specialChars = " !";
 */
public class RetrieveLetters_Digits_SpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!?";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean letter = Character.isLetter(ch);
            boolean digit = Character.isDigit(ch);
            boolean specialChar = !Character.isLetterOrDigit(ch);

            if (letter) {
                letters += ch;
            } else if (digit) {
                digits += ch;
            } else if (specialChar) {
                specialChars += ch;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
