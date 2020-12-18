package students.polina_ivashkevich.lesson_7.level_1.task_3;

public class WordServiceTest {

    public static void main(String[] args) {
        WordService test =new WordService();
        String  text= test.findMostFrequentWord("Romeo and Julietta");
        if(test.movie() == text){
            System.out.println("Ok");
        }else{
            System.out.println("Fail");
        }
    }
}
