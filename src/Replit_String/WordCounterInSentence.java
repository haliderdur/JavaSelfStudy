package Replit_String;

/*
Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

        input:
                * String str="Java is java in everywhere is Java";
                * String word="Java";
        output: 3
 */
public class WordCounterInSentence {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        String word = "Java";
        str = str.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (str.contains(word)) {
            str = str.replaceFirst(word, " ");
            count++;
        }
        System.out.println(count);
    }
}
