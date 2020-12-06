package students.polina_ivashkevich.lesson_5.level_4.task_28;

public class New2 {
    public static void main(String[] args) {
        int num= (int) (Math.random()*10);
        int[]numbers=new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i]=(int) (Math.random()*10);
            System.out.println(numbers[i]);
        }
        int minValue=numbers[0];
        for (int i = 0; i < num; i++) {
            if(numbers[i]<minValue){
                minValue=numbers[i];
                System.out.println("min:"+ minValue );
            }
        }
    }
}
