package students.jana_sergejenko.lesson_7.level_6.task_11;

public class Palindrome {

    boolean isPalindrome(String text) {
        String text2=text.toLowerCase();
        char[] text1=text2.toCharArray();
        for (int i = 0; i < text1.length / 2; i++) {
            if (text1[i] != text1[text1.length - i - 1]) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        Palindrome test= new Palindrome();
        System.out.println(test.isPalindrome("pencil"));
    }
}

