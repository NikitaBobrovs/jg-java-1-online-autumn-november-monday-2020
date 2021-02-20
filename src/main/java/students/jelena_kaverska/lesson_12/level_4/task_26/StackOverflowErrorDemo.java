package students.jelena_kaverska.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        StackOverflowErrorDemo.calculate(1);

    }

    static int calculate(int a) {
        return a + calculate(a);
    }
}