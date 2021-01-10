package students.jana_sergejenko.lesson_7.level_6.task_11;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();

    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("level");
        boolean expected = true;
        System.out.println("result " + checkResult(result, expected));
    }

    public void scenario2() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("sum summus mus");
        boolean expected = true;
        System.out.println("result " + checkResult(result, expected));
    }

    public void scenario3() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("racecar");
        boolean expected = true;
        System.out.println("result " + checkResult(result, expected));
    }

    public void scenario4() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("pencil");
        boolean expected = false;
        System.out.println("result " + checkResult(result, expected));
    }

}
