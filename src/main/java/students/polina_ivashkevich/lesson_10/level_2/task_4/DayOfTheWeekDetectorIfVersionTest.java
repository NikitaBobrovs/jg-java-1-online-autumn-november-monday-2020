package students.polina_ivashkevich.lesson_10.level_2.task_4;

public class DayOfTheWeekDetectorIfVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest subject = new DayOfTheWeekDetectorIfVersionTest();
        subject.detectDayNameTest1();
        subject.detectDayNameTest2();
        subject.detectDayNameTest3();
    }
    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }
    private boolean tester(String expected, String real) {
        return expected.equals(real);

    }
    void detectDayNameTest1() {
        System.out.println(("Detect day test (number in range ) : " + testResult(tester("Monday",
                new DayOfTheWeekDetectorArrayVersion().detectDayName(1)))));
    }
    void detectDayNameTest2() {
        System.out.println(("Detect day test (positive number out of range) :" + testResult(tester("Input a valId number between 1 and 7",
                new DayOfTheWeekDetectorArrayVersion().detectDayName((9))))));
    }
    void detectDayNameTest3() {
        System.out.println(("Detect day test (negative number out of range) :" + testResult(tester("Input a valid number between 1 and 7",
                new DayOfTheWeekDetectorArrayVersion().detectDayName(-9)))));
    }
}
