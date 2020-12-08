package students.jekaterina_aleksejeva.lesson_6.level_1.task_6;

class NumberUtils {

    public boolean isEven(int number) { return ((number % 2 == 0));}

}

class NumberUtilsDemo {
    public static void main(String[] args) {
        NumberUtils demo = new NumberUtils();
        System.out.println(demo.isEven(7));
    }

}

class NumberUtilsTest {

    boolean checkBooleanTest(boolean expected, boolean actual) {
        return expected == actual;
    }

    public static void main(String[] args) {

        NumberUtilsTest check = new NumberUtilsTest();
        check.caseZeroEven();
        check.caseOppositeEven_1();
        check.caseOppositeEven_2();
        check.caseOdd();
    }

    public void caseZeroEven() {
        String scenario = "= 0 is even, should return TRUE";
        if (checkBooleanTest(true, new NumberUtils().isEven(0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }

    }

    public void caseOppositeEven_1() {
        String scenario = "= -4 is even, should return TRUE";
        if (checkBooleanTest(true, new NumberUtils().isEven(-4))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }

    }

    public void caseOppositeEven_2() {
        String scenario = "= 4 is even, should return TRUE";
        if (checkBooleanTest(true, new NumberUtils().isEven(4))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }

    }
    public void caseOdd () {
        String scenario = "= 9 is not even, should return FALSE";
        if (checkBooleanTest(false, new NumberUtils().isEven(9))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }

    }

}


