package students.polina_ivashkevich.lesson_5.level_5.task_32;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test=new ArrayUtilTest();
        test.shouldCreateArray();
    }


    public void shouldCreateArray(){
        ArrayUtil arrayUtil=new ArrayUtil();
        int[] RealResult=arrayUtil.createArray(6);
        int[]ExpectedResult=new int[6];
        if (RealResult.length== ExpectedResult.length){
            System.out.println("Ok");
        }else{
            System.out.println( "Fail");
        }
    }
}
