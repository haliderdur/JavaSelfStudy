package SelfStudy.Fun;

// revWords("apple banana kiwi") -> "kiwi banana apple"
// revWords("I am John Doe")     -> "Doe John am I"
// revWords("orange")            -> "orange"

public class ReversePositionsOfWords {

    public static String reverseWords(String str) {

        StringBuilder result = new StringBuilder();

        String[] words = str.split(" "); // [apple, banana, kiwi]

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i] + " ");
        }

        System.out.println(result);
        return result.toString();


    }

    public static void main(String[] args) {

        reverseWords("apple banana kiwi");
        reverseWords("I am John Doe");
        reverseWords("orange");

    }
}
