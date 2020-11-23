package instructor.lesson_4;

public class LogicalOperations {

    public static void main(String[] args) {

        int x = 21;
        boolean isEven = x % 2 == 0;

        System.out.println(x + " is even: " + isEven);

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        int y = 0;
        boolean isGreaterThanZero = y > 0;

        System.out.println(y + " is greater than 0: " + isGreaterThanZero);

        int z = 5;
        boolean isInRange = !(z >= 0 && z <= 10);

        boolean flag = false;
        boolean notFlag = !flag;

        System.out.println("flag = " + flag);
        System.out.println("not flag = " + notFlag);

    }
}
