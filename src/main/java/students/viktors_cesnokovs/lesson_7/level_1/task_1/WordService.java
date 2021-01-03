package students.viktors_cesnokovs.lesson_7.level_1.task_1;

import java.util.Arrays;

public class WordService {
    public String[] splitTextInArr(String text) {
        return text.split("");
    }

    String frequentWordInArray(String[] text) {
        Arrays.sort(text);
        int max = 0;
        int count = 1;
        String word = "";

        for (int i = 1; i < text.length; i++) {
            if (text[i].equals(text[0])) {
                count++;
            } else {
                count = 1;
                text[0] = text[i];
            }
            if (max < count) {
                max = count;
                word = text[i];
            }
        }
        return word;
    }

    public String findMostFrequentWord(String text) { return frequentWordInArray(splitTextInArr(text)); }
}
