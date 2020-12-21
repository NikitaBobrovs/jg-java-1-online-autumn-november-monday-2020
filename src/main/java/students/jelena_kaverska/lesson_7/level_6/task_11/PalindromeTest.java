package students.jelena_kaverska.lesson_7.level_6.task_11;

class PalindromeTest {
    Palindrome p = new Palindrome();

    String printResults(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public void testNoSpacesAllLowelCase() {
        String word = "racecar";
        boolean act = p.isPalindrome(word);
        System.out.println("No spaces + all lower case test: " + printResults(act));
    }

    public void testNoSpacesUpperCase() {
        String word = "LeVEl";
        boolean act = p.isPalindrome(word);
        System.out.println("No spaces + some upper case test: " + printResults(act));
    }

    public void testWithSpacesUpperCase1() {
        String word = "sum summus mus";
        boolean act = p.isPalindrome(word);
        System.out.println("With spaces + some upper case test: " + printResults(act));
    }

    public void testWithSpacesUpperCase2() {
        String word = "А роза упала на лапу Азора";
        boolean act = p.isPalindrome(word);
        System.out.println("With spaces + some upper case test: " + printResults(act));
    }

    public void testAllCaps() {
        String word = "SAIPPUAKIVIKAUPPIAS";
        boolean act = p.isPalindrome(word);
        System.out.println("With spaces + some upper case test: " + printResults(act));
    }

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.testNoSpacesAllLowelCase();
        test.testNoSpacesUpperCase();
        test.testWithSpacesUpperCase1();
        test.testWithSpacesUpperCase2();
        test.testAllCaps();
    }
}