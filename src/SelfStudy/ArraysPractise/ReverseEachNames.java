package SelfStudy.ArraysPractise;

public class ReverseEachNames {

    public static void main(String[] args) {

        String[] arr = {"Halid", "Gorkem", "Alex"};

        for (String each : arr) {

            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
