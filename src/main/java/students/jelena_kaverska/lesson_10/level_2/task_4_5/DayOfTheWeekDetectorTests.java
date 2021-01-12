package students.jelena_kaverska.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorTests {
    private DayOfTheWeekDetector dayOfTheWeekDetector;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testIfVersion() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String exp = "Monday";
        String act = dayOfTheWeekDetector.detectDayName(1);
        System.out.println("If-version Monday test: " + printResults(exp.equals(act)));
    }

    void testIfVersion2() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String exp = "Sunday";
        String act = dayOfTheWeekDetector.detectDayName(7);
        System.out.println("If-version Sunday test: " + printResults(exp.equals(act)));
    }

    void testIfVersion3() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(0);
        System.out.println("If-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testIfVersion4() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(-1);
        System.out.println("If-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testIfVersion5() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(8);
        System.out.println("If-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testSwitchVersion() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String exp = "Monday";
        String act = dayOfTheWeekDetector.detectDayName(1);
        System.out.println("Switch-version Monday test: " + printResults(exp.equals(act)));
    }

    void testSwitchVersion2() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String exp = "Sunday";
        String act = dayOfTheWeekDetector.detectDayName(7);
        System.out.println("Switch-version Sunday test: " + printResults(exp.equals(act)));
    }

    void testSwitchVersion3() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(0);
        System.out.println("Switch-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testSwitchVersion4() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(-1);
        System.out.println("Switch-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testSwitchVersion5() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(8);
        System.out.println("Switch-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testStringArrayVersion() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        String exp = "Monday";
        String act = dayOfTheWeekDetector.detectDayName(1);
        System.out.println("String array-version Monday test: " + printResults(exp.equals(act)));
    }

    void testStringArrayVersion2() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        String exp = "Sunday";
        String act = dayOfTheWeekDetector.detectDayName(7);
        System.out.println("String array-version Sunday test: " + printResults(exp.equals(act)));
    }

    void testStringArrayVersion3() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(0);
        System.out.println("String array-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testStringArrayVersion4() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(-1);
        System.out.println("String array-version invalid number test: " + printResults(exp.equals(act)));
    }

    void testStringArrayVersion5() {
        dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        String exp = "Please input a valid number between 1 and 7";
        String act = dayOfTheWeekDetector.detectDayName(8);
        System.out.println("String array-version invalid number test: " + printResults(exp.equals(act)));
    }


    public static void main(String[] args) {
        DayOfTheWeekDetectorTests tests = new DayOfTheWeekDetectorTests();
        tests.testIfVersion();
        tests.testIfVersion2();
        tests.testIfVersion3();
        tests.testIfVersion4();
        tests.testIfVersion5();
        System.out.println("-----------------------------------------");
        tests.testSwitchVersion();
        tests.testSwitchVersion2();
        tests.testSwitchVersion3();
        tests.testSwitchVersion4();
        tests.testSwitchVersion5();
        System.out.println("-----------------------------------------");
        tests.testStringArrayVersion();
        tests.testStringArrayVersion2();
        tests.testStringArrayVersion3();
        tests.testStringArrayVersion4();
        tests.testStringArrayVersion5();
    }

}
