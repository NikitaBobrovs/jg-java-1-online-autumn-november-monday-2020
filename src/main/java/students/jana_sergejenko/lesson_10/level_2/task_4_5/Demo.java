package students.jana_sergejenko.lesson_10.level_2.task_4_5;

public class Demo {
    public static void main(String[] args) {
        Demo test = new Demo();
        test.scenario1();
        test.scenario2();
        test.scenario3();
    }

    public String checkResult(String result, String expected) {
        if (result.equals(expected)) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
        String result = test.detectDayName(3);
        String expected = "Wednesday";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

    public void scenario2() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
        String result = test.detectDayName(5);
        String expected = "Friday";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

    public void scenario3() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
        String result = test.detectDayName(9);
        String expected = "Please input a valid number between 1 and 7";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

}
