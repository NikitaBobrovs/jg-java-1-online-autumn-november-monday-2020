package students.jelena_kaverska.lesson_4.level_5.task_16;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        violetTest();
        violetTest2();

        blueTest();
        blueTest2();

        greenTest();
        greenTest2();

        yellowTest();
        yellowTest2();

        orangeTest();
        orangeTest2();

        redTest();
        redTest2();

        invisibleTest();
        invisibleTest2();
    }

    static void violetTest() {
        String scenario = "Violet color test";
        int selection = 380;
        String expected = "Violet";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void violetTest2() {
        String scenario = "Violet color test";
        int selection = 449;
        String expected = "Violet";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void blueTest() {
        String scenario = "Blue color test";
        int selection = 450;
        String expected = "Blue";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void blueTest2() {
        String scenario = "Blue color test";
        int selection = 494;
        String expected = "Blue";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void greenTest() {
        String scenario = "Green color test";
        int selection = 495;
        String expected = "Green";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void greenTest2() {
        String scenario = "Green color test";
        int selection = 569;
        String expected = "Green";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void yellowTest() {
        String scenario = "Yellow color test";
        int selection = 570;
        String expected = "Yellow";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void yellowTest2() {
        String scenario = "Yellow color test";
        int selection = 589;
        String expected = "Yellow";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void orangeTest() {
        String scenario = "Orange color test";
        int selection = 590;
        String expected = "Orange";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void orangeTest2() {
        String scenario = "Orange color test";
        int selection = 619;
        String expected = "Orange";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void redTest() {
        String scenario = "Red color test";
        int selection = 620;
        String expected = "Red";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void redTest2() {
        String scenario = "Red color test";
        int selection = 750;
        String expected = "Red";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void invisibleTest() {
        String scenario = "Invisible light test";
        int selection = 1;
        String expected = "Invisible Light";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void invisibleTest2() {
        String scenario = "Invisible light test";
        int selection = 751;
        String expected = "Invisible Light";
        String actual = new LightColorDetector().detect(selection);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }
}