package CoderByte;

import java.util.ArrayList;

public class QuestionMarks {
    public static String QuestionsMarks(String str) {

        String hasQmark = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) || ch == '?') {
                list.add("" + ch);
            }
        }


        for (String each : list) {
            for (int k = 0; k < list.size(); k++) {
                if (!list.get(k).equals("?")) {
                    for (int l = k + 1; l < list.size() - 2; l++) {
                        if (list.indexOf(l) == '?' && list.indexOf(l + 1) == '?' && list.indexOf(l + 2) == '?') {
                            hasQmark = "true";
                        }
                    }
                }
            }
        }

        return hasQmark;
    }

}
