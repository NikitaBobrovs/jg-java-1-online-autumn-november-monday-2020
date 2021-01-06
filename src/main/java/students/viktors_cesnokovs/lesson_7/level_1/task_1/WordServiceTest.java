package students.viktors_cesnokovs.lesson_7.level_1.task_1;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.frequentWordInArrayTest();
        test.wordServiceTest();
    }

    String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    boolean tester(String expected, String real) { return expected.equals(real); }

    void wordServiceTest() {
        String test = "I like peach because i like fruits";
        System.out.println("Most frequent word in text : "
                + result(tester("like", new WordService().findMostFrequentWord(test)))); }

    void frequentWordInArrayTest() {
        String[] test = {"This", "task", "is", "task", "number", "one"};
        System.out.println("Most frequent word : "
                + result(tester("task", new WordService().frequentWordInArray(test)))); }
}
