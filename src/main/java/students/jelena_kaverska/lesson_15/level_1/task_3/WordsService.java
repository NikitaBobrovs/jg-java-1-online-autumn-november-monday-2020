package students.jelena_kaverska.lesson_15.level_1.task_3;

class WordsService {

    //wordToCount тоже неплох
    int countRepetitions(String[] words, String wordToCount) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                repetitions++;
            }
        }
        return repetitions;
    }
}