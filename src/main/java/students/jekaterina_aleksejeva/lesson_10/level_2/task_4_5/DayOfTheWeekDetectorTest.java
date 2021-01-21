package students.jekaterina_aleksejeva.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.ifVersionNegative();
        test.ifVersion0();
        test.ifVersion1();
        test.ifVersion3();
        test.ifVersion7();
        test.ifVersion8();
        test.switchVersionNegative();
        test.switchVersion0();
        test.switchVersion1();
        test.switchVersion2();
        test.switchVersion7();
        test.switchVersion8();
        test.arrayVersionNegative();
        test.arrayVersion0();
        test.arrayVersion1();
        test.arrayVersion4();
        test.arrayVersion7();
        test.arrayVersion8();

    }

    boolean checkBooleanTest(String expectedResult, String actualResult) {

        return expectedResult.equals(actualResult);
    }

    void ifVersionNegative() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(-3))) {
            System.out.println("ifVersion: week day Nr -3 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("ifVersion: week day Nr -3 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void ifVersion0() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(0))) {
            System.out.println("ifVersion: week day Nr 0 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("ifVersion: week day Nr 0 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void ifVersion1() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Monday", detector.detectDayName(1))) {
            System.out.println("ifVersion: week day Nr 1 corresponds to Monday = PASS");
        } else {
            System.out.println("ifVersion: week day Nr 1 corresponds to Monday = FAILED");
        }
    }

    void ifVersion3() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Wednesday", detector.detectDayName(3))) {
            System.out.println("ifVersion: week day Nr 3 corresponds to Wednesday = PASS");
        } else {
            System.out.println("ifVersion: week day Nr 3 corresponds to Wednesday = FAILED");
        }
    }

    void ifVersion7() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Sunday", detector.detectDayName(7))) {
            System.out.println("ifVersion: week day Nr 7 corresponds to Sunday = PASS");
        } else {
            System.out.println("ifVersion: week day Nr 7 corresponds to Sunday = FAILED");
        }
    }

    void ifVersion8() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorIfVersion();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(8))) {
            System.out.println("ifVersion: week day Nr 8 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("ifVersion: week day Nr 8 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void switchVersionNegative() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(-5))) {
            System.out.println("switchVersion: week day Nr -5 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("switchVersion: week day Nr -5 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void switchVersion0() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(0))) {
            System.out.println("switchVersion: week day Nr 0 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("switchVersion: week day Nr 0 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void switchVersion1() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Monday", detector.detectDayName(1))) {
            System.out.println("switchVersion: week day Nr 1 corresponds to Monday = PASS");
        } else {
            System.out.println("switchVersion: week day Nr 1 corresponds to Monday = FAILED");
        }
    }

    void switchVersion2() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Tuesday", detector.detectDayName(2))) {
            System.out.println("switchVersion: week day Nr 2 corresponds to Tuesday = PASS");
        } else {
            System.out.println("switchVersion: week day Nr 2 corresponds to Tuesday = FAILED");
        }
    }

    void switchVersion7() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Sunday", detector.detectDayName(7))) {
            System.out.println("switchVersion: week day Nr 7 corresponds to Sunday = PASS");
        } else {
            System.out.println("switchVersion: week day Nr 7 corresponds to Sunday = FAILED");
        }
    }

    void switchVersion8() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaSwitch();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(8))) {
            System.out.println("switchVersion: week day Nr 0 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("switchVersion: week day Nr 0 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void arrayVersionNegative() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(-1))) {
            System.out.println("arrayVersion: week day Nr -1 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr -1 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void arrayVersion0() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(0))) {
            System.out.println("arrayVersion: week day Nr 0 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr 0 is out of boundaries from 1 to 7 = FAILED");
        }
    }

    void arrayVersion1() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Monday", detector.detectDayName(1))) {
            System.out.println("arrayVersion: week day Nr 1 corresponds to Monday = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr 1 corresponds to Monday = FAILED");
        }
    }

    void arrayVersion4() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Thursday", detector.detectDayName(4))) {
            System.out.println("arrayVersion: week day Nr 4 corresponds to Thursday = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr 4 corresponds to Thursday = FAILED");
        }
    }

    void arrayVersion7() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Sunday", detector.detectDayName(7))) {
            System.out.println("arrayVersion: week day Nr 7 corresponds to Sunday = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr 7 corresponds to Sunday = FAILED");
        }
    }

    void arrayVersion8() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetectorViaArray();
        if (checkBooleanTest("Please input a valid number between 1 and 7", detector.detectDayName(8))) {
            System.out.println("arrayVersion: week day Nr 8 is out of boundaries from 1 to 7 = PASS");
        } else {
            System.out.println("arrayVersion: week day Nr 8 is out of boundaries from 1 to 7 = FAILED");
        }
    }

}
