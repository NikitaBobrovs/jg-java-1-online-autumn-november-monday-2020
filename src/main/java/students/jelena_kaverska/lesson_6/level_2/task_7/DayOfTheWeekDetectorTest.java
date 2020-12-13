package students.jelena_kaverska.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {
    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean compareResults(String expected, String actual) {
        return expected.equalsIgnoreCase(actual);
    }

    public void testDay(String expectedDay, int dayNumber) {
        String actual = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        System.out.println(expectedDay + " test: " + printResult(compareResults(expectedDay, actual)));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest detectorTest = new DayOfTheWeekDetectorTest();
        detectorTest.testDay("MONDAY", 1);
        detectorTest.testDay("Tuesday", 2);
        detectorTest.testDay("Wednesday", 3);
        detectorTest.testDay("Thursday", 4);
        detectorTest.testDay("Friday", 5);
        detectorTest.testDay("Saturday", 6);
        detectorTest.testDay("Sunday", 7);
        detectorTest.testDay("Not correct day number", 10);
    }
}