package students.jekaterina_aleksejeva.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordService {

    public String[] getTextArray(String text) {
        String[] textArr = text.split(" ");
        return textArr;
    }

    public String frequentWordCounter(String[] textArr) {
        Arrays.sort(textArr);
        int maxCount = 1;
        int count = 1;
        String key = textArr[0];
        for (int i = 1; i < textArr.length; i++) {
            if (textArr[i].equals(textArr[i - 1])) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    key = textArr[i - 1];
                }
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                key = textArr[i - 1];
            }
        }
        return key;
    }

    public String findMostFrequentWord(String text){
        return frequentWordCounter(getTextArray(text));
    }
}

class WordServiceDemo {

    public static void main(String[] args) {
        WordService demo = new WordService();
        String demoText = "playful cat is happy and happy cat is healthy";
        String[] demoArray = demo.getTextArray(demoText);
        System.out.println("Text is split into array: ");
        System.out.println(Arrays.toString(demoArray));
        System.out.println("The first frequent word in sorted array according to counter = " + demo.frequentWordCounter(demoArray));
        System.out.println("The first most frequent word in text sorted asc = " + demo.findMostFrequentWord(demoText));

    }

}

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.createTextArray();
        test.returnFirstFrequentWordInArray();
        test.findFirstFrequentWordInText();

    }

    public void createTextArray() {

        WordService service = new WordService();
        String scenario = " = text with no punctuation split into String array of 7 elements";
        String testText = "soft kitty is little ball of fur";
        String[] expected = {"soft", "kitty", "is", "little", "ball", "of", "fur"};
        String[] actual = service.getTextArray(testText);
        if (Arrays.equals(expected, actual)) {
            System.out.println("PASSED" + scenario);
        } else System.out.println("FAIL" + scenario);

    }

    public void returnFirstFrequentWordInArray() {
        WordService service = new WordService();
        String scenario = " = the 1st most frequent word of 2 frequent words' in array after sorting is detected";
        String[] testArray = {"soft", "kitty", "is", "warm", "kitty", "sleepy", "one", "is", "ball", "of", "fur"};
        String expected = "is";
        if (expected.equals(service.frequentWordCounter(testArray))) {
            System.out.println("PASSED" + scenario);
        } else System.out.println("FAIL" + scenario);

    }

    public void findFirstFrequentWordInText() {
        WordService service = new WordService();
        String scenario = " = the 1st most frequent word of 2 frequent words' in asc order in text detected";
        String testText = "happy kitty well-fed kitty slippy kitty purr purr purr";
        String expected = "kitty";
        if (expected.equals(service.findMostFrequentWord(testText))) {
            System.out.println("PASSED" + scenario);
        } else System.out.println("FAIL" + scenario);

    }

}



