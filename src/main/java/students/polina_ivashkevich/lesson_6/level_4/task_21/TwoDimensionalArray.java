package students.polina_ivashkevich.lesson_6.level_4.task_21;

public class TwoDimensionalArray {





    public static void randomNumber(){
        int sum;
        int[] r=new int[2];
        r[0] =432;
        r[1]=5436;
        sum=r[0]+r[1];
        System.out.println(sum);
    }
}class TwoDimensionalArrayTest{
    public static void main(String[] args) {
        TwoDimensionalArray array1=new TwoDimensionalArray();
        array1.randomNumber();
    }
}

