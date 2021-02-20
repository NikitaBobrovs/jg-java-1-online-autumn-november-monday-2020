package students.polina_ivashkevich.lesson_15.level_1.task_3;

public class WordsService {

    int countRepetitions(String[] words, String wordToCount) {
        int repetitions = 0;
        for(String word : words) {
            if (word.equals(wordToCount)) {
                repetitions++;
            }
        }
        return repetitions;
    }
}
