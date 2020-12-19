package students.nikita_bobrovs.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest subject = new WordServiceTest();
        subject.splitTextInArrayTest();
        subject.findMostFrequentWordTest();
        subject.wordServiceTest();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "(OK)";
        } else
            return "(FAIL)";
    }

    boolean arrayTester(String[] expectedResult, String[] realResult) {
        return Arrays.equals(expectedResult, realResult);
    }

    boolean stringTester(String expectedResult, String realResult) {
        return expectedResult.equals(realResult);
    }

    void splitTextInArrayTest() {
        String test = "This Is Word Service";
        String[] expectedResult = {"this", "is", "word", "service"};
        System.out.println("Text to lower case to array test : " + testResult(arrayTester
                (expectedResult, new WordService().splitTextInArray(test))));
    }

    void findMostFrequentWordTest() {
        String[] test = {"this", "is", "word", "service", "word"};
        System.out.println("Most frequent word in array test : " + testResult(stringTester
                ("word", new WordService().findMostFrequentWord(test))));
    }

    void wordServiceTest() {
        String test = "A B C B C B";
        System.out.println("Most frequent word in text test : " + testResult(stringTester
                ("b", new WordService().findMostFrequentWord
                        (new WordService().splitTextInArray(test)))));
    }
}
