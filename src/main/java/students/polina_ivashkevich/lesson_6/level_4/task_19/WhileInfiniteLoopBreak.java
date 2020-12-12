package students.polina_ivashkevich.lesson_6.level_4.task_19;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int w =100;
        while (w<=100){
            System.out.println("Цикл бесконечен ");
            w--;
            if (w==0){
                System.out.println("Конец цикла");
                break;
            }
        }
    }
}
class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 100; i <= 100; i--) {
            System.out.println("Цикл бесконечен ");
            if (i==1){
                System.out.println("Конец цикла");
                break;
            }
        }
    }
}
