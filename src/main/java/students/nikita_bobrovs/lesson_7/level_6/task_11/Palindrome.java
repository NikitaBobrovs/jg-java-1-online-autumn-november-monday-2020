package students.nikita_bobrovs.lesson_7.level_6.task_11;

class Palindrome {
    private char[] textToArray(String text) {
        text = text.toLowerCase();
        return text.toCharArray();
    }

    boolean isPalindrome(String text) {
        char[] chars = textToArray(text);
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
