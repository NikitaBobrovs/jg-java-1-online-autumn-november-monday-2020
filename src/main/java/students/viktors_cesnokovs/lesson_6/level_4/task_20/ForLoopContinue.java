package students.viktors_cesnokovs.lesson_6.level_4.task_20;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
