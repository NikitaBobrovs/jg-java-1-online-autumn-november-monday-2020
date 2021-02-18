package students.polina_ivashkevich.lesson_7.level_1.task_2;

class WordServiceTest {
    private WordService wordService = new WordService();

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testMostFrequentWord() {
        String text = "Lorem, text,Ipsum,is,simply,dummy,text,Lorem,industry,text, Lorem";
        String exp = "Lorem";
        String act = wordService.findMostFrequentWord(text);
        System.out.println("Test most frequent word: " + printResults(exp.equals(act)));
    }

    void testMostFrequentWord1() {
        String text = "Lorem, text,Ipsum,is,simply,dummy,text,Lorem,industry,text, Lorem";
        String exp = "Lorem";
        String act = wordService.findMostFrequentWord1(text);
        System.out.println("Test most frequent word: " + printResults(exp.equals(act)));
    }

    public static void main(String[] args) {
        WordServiceTest tests = new WordServiceTest();
        tests.testMostFrequentWord();
        tests.testMostFrequentWord1();
    }
}