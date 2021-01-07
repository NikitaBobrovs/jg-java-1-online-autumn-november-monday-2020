package students.jelena_kaverska.lesson_7.level_6.task_11;

class Palindrome {

    boolean isPalindrome(String text) {
        StringBuilder rev = new StringBuilder();
        text = text.replaceAll("\\s","");
        char [] chars = text.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            rev.append(chars[i]);
        }
        String reversed = rev.toString();
        return reversed.equalsIgnoreCase(text);
    }
}

class MyPalDemo {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String text = "А роза упала на лапу Азора";
        String text4 = "Лёша на полке клопа нашёл";
        String text5 = "SAIPPUAKIVIKAUPPIAS";
        System.out.println(p.isPalindrome(text));
        System.out.println(p.isPalindrome(text4));
        System.out.println(p.isPalindrome(text5));
    }
}