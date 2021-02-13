package students.viktors_cesnokovs.lesson_12.level_4.task_26;

class StackOverflowError {
    static int i = 0;

    public static int printNumber(int x) {
        i = i + 2;
        System.out.println(i);
        return i + printNumber(i + 2);
    }

    public static void main(String[] args) {
        StackOverflowError.printNumber(i);
    }
}
