package instructor.lesson_4;

class QuickMath {

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    int min(int a, int b, int c) {
        return min(a, min(b, c));
//        if (a < b && a < c && a < d) {
//            return a;
//        } else if (b < a && b < c && b < d) {
//            return b;
//        } else if (c < a && c < b && c < d){
//            return c;
//        } else {
//            return d;
//        }
    }
}

class QuickMathDemo {

    public static void main(String[] args) {

        QuickMath math = new QuickMath();
        System.out.println(math.min(5, 10));

    }
}

class QuickMathTest {

    public static void main(String[] args) {
        scenario_1();
        scenario_2();
        scenario_3();
    }

    static void scenario_1() {
        String scenario = "5 and 3 - 5 is max";
        QuickMath subject = new QuickMath();

        int expectedResult = 5;
        int actualResult = subject.max(5, 3);

        if (expectedResult == actualResult) {
            System.out.println("[ OK ]: " + scenario);
        } else {
            System.out.println("[FAIL]: " + scenario);
        }
    }

    static void scenario_2() {
        String scenario = "4 and 8 - 8 is max";
        QuickMath subject = new QuickMath();

        int expectedResult = 8;
        int actualResult = subject.max(4, 8);

        if (expectedResult == actualResult) {
            System.out.println("[ OK ]: " + scenario);
        } else {
            System.out.println("[FAIL]: " + scenario);
        }
    }

    static void scenario_3() {
        String scenario = "0 and 0 - 0 is max";
        QuickMath subject = new QuickMath();

        int expectedResult = 0;
        int actualResult = subject.max(0, 0);

        if (expectedResult == actualResult) {
            System.out.println("[ OK ]: " + scenario);
        } else {
            System.out.println("[FAIL]: " + scenario);
        }
    }
}
