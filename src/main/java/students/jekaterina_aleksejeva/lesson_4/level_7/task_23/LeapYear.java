package students.jekaterina_aleksejeva.lesson_4.level_7.task_23;

class LeapYear {
    public boolean isLeapYear(int year) {
       if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
           return true;
       } else return false;
    }
}

class LeapYearTest {
    public static void main(String[] args) {
        scenarioLeap_1();
        scenarioLeap_2();
        scenarioNotLeap_1();
        scenarioNotLeap_2();

    }
    static void scenarioLeap_1(){
        String scenario = " year 2000 is LEAP as divisible by 400";
        boolean expectedResult = true;
        boolean actualResult = new LeapYear().isLeapYear(2000);
        if (expectedResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioLeap_2(){
        String scenario = " year 2024 is LEAP as divisible by 4 and not by 100";
        boolean expectedResult = true;
        boolean actualResult = new LeapYear().isLeapYear(2024);
        if (expectedResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioNotLeap_1(){
        String scenario = " year 2021 is NOT LEAP as is not divisible by 4";
        boolean expectedResult = false;
        boolean actualResult = new LeapYear().isLeapYear(2021);
        if (expectedResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioNotLeap_2(){
        String scenario = " year 1900 is NOT LEAP as is not divisible by 400";
        boolean expectedResult = false;
        boolean actualResult = new LeapYear().isLeapYear(1900);
        if (expectedResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
}

