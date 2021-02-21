package students.tatjana_topcilina.lesson_7.level_1.task_1;



public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest subject = new WordServiceTest();
        subject.mostFrequentWordInArrayTest();
        subject.wordServiceTest();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "(Passed)";
        } else
            return "(Failed)";
    }

    boolean stringTester(String expectedResult, String realResult) {
        return expectedResult.equals(realResult);
    }

    void mostFrequentWordInArrayTest() {
        String[] test = {"hello", "world", "hello", "earth"};
        System.out.println("Most frequent word in array test : " + testResult(stringTester
                ("hello", new WordService().mostFrequentWordInArray(test))));
    }

    void wordServiceTest() {
        String test = "This world is most perfect world";
        System.out.println("Most frequent word in text test : " + testResult(stringTester
                ("world", new WordService().findMostFrequentWord(test))));
    }

}
