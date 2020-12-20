package students.nikita_bobrovs.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordService {
    private String[] splitTextInArray(String text) {
        text = text.toLowerCase();
        return text.split(" ");
    }
    String mostFrequentWordInArray(String[] text){
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

    public String findMostFrequentWord(String text) {
        return mostFrequentWordInArray(splitTextInArray(text));
    }
}
