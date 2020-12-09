package students.jana_sergejenko.lesson_6.level_4.task_20;

public class ForInfiniteLoop {
    public static void main(String[] args) {
        for (int i=0;i<4;i++) {
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}