package students.jelena_kaverska.lesson_4.level_7.task_23;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false; //regular
        } else if (year % 100 != 0) {
            return true; //leap
        } else if (year % 400 != 0) {
            return false; //regular
        }
        return true;
    }
}

class LeapYearMyDemo {
    public static void main(String[] args) {
        LeapYear leap = new LeapYear();
        System.out.println(leap.isLeapYear(1900));
    }
}

class LeapYearTest {
    public static void main(String[] args) {
        isLeapTest1();
        isLeapTest2();
        isLeapTest3();
    }

    static void isLeapTest1() {
        String scenario = "Year is leap: 1900 - false";
        int year = 1900;
        boolean expected = false;
        boolean actual = new LeapYear().isLeapYear(year);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void isLeapTest2() {
        String scenario = "Year is leap: 2020 - true";
        int year = 2020;
        boolean expected = true;
        boolean actual = new LeapYear().isLeapYear(year);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void isLeapTest3() {
        String scenario = "Year is leap: 2001 - false";
        int year = 2001;
        boolean expected = false;
        boolean actual = new LeapYear().isLeapYear(year);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }
}