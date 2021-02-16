package students.jana_sergejenko.lesson_10.level_2.task_4_5;

public class DemoArray {
    public static void main(String[] args) {
        DemoArray test = new DemoArray();
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
        DayofTheWeekDetectorArray test = new DayofTheWeekDetectorArray();
        String result = test.detectDayName(3);
        String expected = "Tuesday";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

    public void scenario2() {
        DayofTheWeekDetectorArray test = new DayofTheWeekDetectorArray();
        String result = test.detectDayName(5);
        String expected = "Thursday";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

    public void scenario3() {
        DayofTheWeekDetectorArray test = new DayofTheWeekDetectorArray();
        String result = test.detectDayName(9);
        String expected = "Please input a valid number between 1 and 7";
        System.out.println("Days Of The Week Test result " + checkResult(result, expected));
    }

}

