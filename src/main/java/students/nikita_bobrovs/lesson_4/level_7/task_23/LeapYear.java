package students.nikita_bobrovs.lesson_4.level_7.task_23;

class LeapYear {
    public boolean isLeapYear(int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 != 0){
            return true;
        } else return year % 400 == 0;
    }
}


class LeapYearTest {
    public static void main(String[] args) {
        isLeapYearTest1();
        isLeapYearTest2();
        isLeapYearTest3();
        isLeapYearTest4();
    }
    static void isLeapYearTest1(){
        System.out.println("Is it leap year? (divisible by 4)");
        boolean expectedResult = false;
        boolean realResult = new LeapYear().isLeapYear(2013);
        if (expectedResult == realResult){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
    static void isLeapYearTest2(){
        System.out.println("Is it leap year? (divisible by 4 && not divisible by 100)");
        boolean expectedResult = true;
        boolean realResult = new LeapYear().isLeapYear(2012);
        if (expectedResult == realResult){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
    static void isLeapYearTest3(){
        System.out.println("Is it leap year? (divisible by 4 && divisible by 100 && not divisible by 400)");
        boolean expectedResult = false;
        boolean realResult = new LeapYear().isLeapYear(200);
        if (expectedResult == realResult){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
    static void isLeapYearTest4(){
        System.out.println("Is it leap year? (divisible by 4 && divisible by 100 &&  divisible by 400)");
        boolean expectedResult = true;
        boolean realResult = new LeapYear().isLeapYear(1600);
        if (expectedResult == realResult){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
}
