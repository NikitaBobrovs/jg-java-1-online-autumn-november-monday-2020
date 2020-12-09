package students.jana_sergejenko.lesson_6.level_4.task_20;

public class WhileInfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
