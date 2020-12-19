package students.anna_tim.lesson_4.level_3.task_10;

import java.util.Scanner;

class TheBiggestOfThree {

    int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    int maxOfThree(int a, int b, int c) {
        return maxOfTwo(maxOfTwo(a, b), c);
    }

}


class TheBiggestOfThreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        System.out.println("Please enter third number (should be integer):");
        int num3 = scanner.nextInt();

        TheBiggestOfThree maximum = new TheBiggestOfThree();
        System.out.println("Max number is: " + maximum.maxOfThree(num1, num2, num3));
    }
}

//just to try this
class TheBiggestOfThreeTest {
    public static void main(String[] args) {
        scenario1();
        scenario2();
    }

    static void scenario1() {
        String scenario = "3, 4, 5 -> 5";
        TheBiggestOfThree test1 = new TheBiggestOfThree();
        int expected = 5;
        int actual = test1.maxOfThree(3, 4, 5);
        if (expected == actual) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void scenario2() {
        String scenario = "8, 6, 8 -> 8";
        TheBiggestOfThree test2 = new TheBiggestOfThree();
        int expected = 8;
        int actual = test2.maxOfThree(8, 6, 8);
        if (expected == actual) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }
}