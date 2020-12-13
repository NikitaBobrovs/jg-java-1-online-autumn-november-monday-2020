package students.nikita_bobrovs.lesson_6.level_4.task_20;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            i++;
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
