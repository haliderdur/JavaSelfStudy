package SelfStudy.CustomMethods_ReturnPractise;

/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
 */
public class FrequencyOfWord {
    public static void main(String[] args) {
        frequencyOfWord("Java pYtHon jaVA C# java python c# JAVA PythOn javA", "java");
    }

    public static int frequencyOfWord(String sentence, String word) {
        int frequency = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }
        System.out.println("Frequency of \"" + word + "\" is: " + frequency);
        return frequency;
    }


}
