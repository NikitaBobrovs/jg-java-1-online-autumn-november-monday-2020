package students.jana_sergejenko.lesson_7.level_1.task_1;

class WordService {

    public String[] findMostFrequentWord(String text) {
        String[] strgs = text.split(" ");
        return strgs;
    }

   /* void printWordArray(String[] wordArray) {
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[i]);
        }
    }*/

    String countOccurences(String[] str) {
        int count = 0;
        int maxCount = 1;
        String word = " ";
        for (int i = 0; i < str.length; i++) {
            count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }

            }
            if (count > maxCount) {
                maxCount = count;
                word = str[i];

            }
        }
        return word;
    }

    public String returnResult(String text) {
        return countOccurences(findMostFrequentWord(text));

    }

    public static void main(String[] args) {
        WordService test = new WordService();
        String[] wordArray = test.findMostFrequentWord("This is is is is a simple sentence");
        System.out.println("Most Frequent Word: " + test.countOccurences(wordArray));

    }

}