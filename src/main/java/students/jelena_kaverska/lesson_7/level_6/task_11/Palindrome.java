package students.jelena_kaverska.lesson_7.level_6.task_11;

class Palindrome {

    String removeSpaces(String text) {
        char[] strings = text.toCharArray();
        String result = "";
        for (char string : strings) {
            if (string != ' ') {
                result += string;
            }
        }
        return result;
    }

    boolean isPalindrome(String text) {
        String original = removeSpaces(text);
        char[] strings = original.toCharArray();
        String reversed = "";
        //getting reversed original
        for (int i = strings.length - 1; i >= 0; i--) {
            reversed += strings[i];
        }
        return reversed.equalsIgnoreCase(original);
    }

    boolean isPalindrome2(String text) {
        String original = removeSpaces(text);
        String reversed = "";
        //getting reversed original
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return reversed.equalsIgnoreCase(original);
    }

    ///not working
    boolean isPalindrome3(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed.equalsIgnoreCase(text);
    }
}

class MyPalDemo {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String text = "А роза упала на лапу Азора";
        String text4 = "Лёша на полке клопа нашёл";
        String text5 = "SAIPPUAKIVIKAUPPIAS";
        System.out.println(p.removeSpaces(text4));

        System.out.println(p.isPalindrome(text));
        System.out.println(p.isPalindrome(text4));
        System.out.println(p.isPalindrome(text5));

        System.out.println(p.isPalindrome2(text));
        System.out.println(p.isPalindrome2(text4));
        System.out.println(p.isPalindrome2(text5));
        System.out.println("-------");
        System.out.println(p.isPalindrome3(text));
        System.out.println(p.isPalindrome3(text4));
        System.out.println(p.isPalindrome3(text5));
    }
}