package students.polina_ivashkevich.lesson_5.level_4.task_30;

public class New4 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*10);
        int numbers[]=new int[num];
        for (int i = 0; i < num; i++) {
           numbers[i]=(int)(Math.random()*10);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < num; i++) {
            if(numbers[i]%2!=0){
                System.out.println("Odd numbers:"+numbers[i]);
            }

        }
    }
}
