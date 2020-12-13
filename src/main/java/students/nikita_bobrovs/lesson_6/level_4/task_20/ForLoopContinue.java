package students.nikita_bobrovs.lesson_6.level_4.task_20;

public class ForLoopContinue {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
