package students.nikita_bobrovs.lesson_7.level_1.task_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest subject = new WordServiceTest();
        subject.mostFrequentWordInArrayTest();
        subject.wordServiceTest();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "(OK)";
        } else
            return "(FAIL)";
    }

    boolean stringTester(String expectedResult, String realResult) {
        return expectedResult.equals(realResult);
    }

    void mostFrequentWordInArrayTest() {
        String[] test = {"this", "is", "word", "service", "word"};
        System.out.println("Most frequent word in array test : " + testResult(stringTester
                ("word", new WordService().mostFrequentWordInArray(test))));
    }

    void wordServiceTest() {
        String test = "A B C B C B";
        System.out.println("Most frequent word in text test : " + testResult(stringTester
                ("b", new WordService().findMostFrequentWord(test))));
    }
}
