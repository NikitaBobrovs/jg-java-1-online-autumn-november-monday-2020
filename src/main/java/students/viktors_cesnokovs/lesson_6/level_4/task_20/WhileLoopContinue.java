package students.viktors_cesnokovs.lesson_6.level_4.task_20;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 60) {
            if (i % 5 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
