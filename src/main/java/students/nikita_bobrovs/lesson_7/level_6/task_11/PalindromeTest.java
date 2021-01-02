package students.nikita_bobrovs.lesson_7.level_6.task_11;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest subject = new PalindromeTest();
        subject.isPalindromeTest1();
        subject.isPalindromeTest2();
        subject.isPalindromeTest3();
        subject.isPalindromeTest4();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean aBooleanTester(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult;
    }

    void isPalindromeTest1() {
        String text = "sum summus mus";
        System.out.println("Is text palindrome test (lower case)(yes) : " + testResult(aBooleanTester
                (true, new Palindrome().isPalindrome(text))));
    }

    void isPalindromeTest2() {
        String text = "summ summus mus";
        System.out.println("Is text palindrome test (lower case)(no) : " + testResult(aBooleanTester
                (false, new Palindrome().isPalindrome(text))));
    }

    void isPalindromeTest3() {
        String text = "SUM sumMUs mus";
        System.out.println("Is text palindrome test (upper case)(yes) : " + testResult(aBooleanTester
                (true, new Palindrome().isPalindrome(text))));
    }

    void isPalindromeTest4() {
        String text = "sUM suMMUss MUs";
        System.out.println("Is text palindrome test (upper case)(no) : " + testResult(aBooleanTester
                (false, new Palindrome().isPalindrome(text))));
    }

}
