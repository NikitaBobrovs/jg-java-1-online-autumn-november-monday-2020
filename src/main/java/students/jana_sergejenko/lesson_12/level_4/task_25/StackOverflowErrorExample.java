package students.jana_sergejenko.lesson_12.level_4.task_25;

public class StackOverflowErrorExample {
    static int i = 0;
    public static int printNumber(int x)
    {
        i = i + 2;
        System.out.println(i);
        return i + printNumber(i + 2);
    }

    public static void main(String[] args)
    {
        StackOverflowErrorExample.printNumber(i);
    }
}
