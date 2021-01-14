package students.jana_sergejenko.lesson_7.level_1.task_1;

public class WordServiceTest {
    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
    }

    public String checkResult(String result, String expected) {
        if (result.equals(expected)) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        WordService test = new WordService();
        String result = test.returnResult("This is is is is a simple sentence");
        String expected = "is";
        System.out.println("Incorrect PIN result " + checkResult(result, expected));
    }

    public void scenario2() {
        WordService test = new WordService();
        String result = test.returnResult("This is is is is a simple simple simple simple sentence");
        String expected = "is";
        System.out.println("Incorrect PIN result " + checkResult(result, expected));
    }

    public void scenario3() {
        WordService test = new WordService();
        String result = test.returnResult("This is is is is a a a a a simple sentence");
        String expected = "a";
        System.out.println("Incorrect PIN result " + checkResult(result, expected));
    }

    public void scenario4() {
        WordService test = new WordService();
        String result = test.returnResult("sentence This sentence is sentence is is a simple sentence");
        String expected = "sentence";
        System.out.println("Incorrect PIN result " + checkResult(result, expected));
    }

}
