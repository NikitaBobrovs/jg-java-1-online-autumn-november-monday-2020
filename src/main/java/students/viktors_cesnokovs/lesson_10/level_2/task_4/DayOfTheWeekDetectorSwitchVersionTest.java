package students.viktors_cesnokovs.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.detectDayName1();
        test.detectDayName2();
        test.detectDayName3();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    private boolean tester(String expected, String real) {
        return expected.equals(real);
    }

    void detectDayName1() {
        System.out.println("Detect day test : " + result
                (tester("Monday", new DayOfTheWeekDetectorSwitchVersion().detectDayName(1))));
    }

    void detectDayName2() {
        System.out.println("Detect day test : " + result
                (tester("Please enter number between 1 and 7",
                        new DayOfTheWeekDetectorSwitchVersion().detectDayName(10))));
    }

    void detectDayName3() {
        System.out.println("Detect day test : " + result
                (tester("Please enter number between 1 and 7",
                        new DayOfTheWeekDetectorSwitchVersion().detectDayName(-10))));
    }
}
