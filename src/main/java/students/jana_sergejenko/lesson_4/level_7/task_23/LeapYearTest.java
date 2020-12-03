package students.jana_sergejenko.lesson_4.level_7.task_23;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        LeapYearTest.scenario1();
        LeapYearTest.scenario2();
    }

    static void scenario1() {
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = LeapYear.isLeapYear(2000);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void scenario2() {
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = LeapYear.isLeapYear(2001);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}
