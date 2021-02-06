package students.polina_ivashkevich.lesson_7.level_1.task_1;

 public class WordServiceTest {


     public static void main(String[] args) {
        WordServiceTest subject = new WordServiceTest();
        subject.mostFrequentWordInArrayTest();
        subject.wordServiceTest();

    }
    String testResult(boolean tester) {
        if (tester) {
            return "Ok";
        } else {
            return "Fail";
        }
     }
     boolean stringTester (String expectedResult, String realResult) {

         return expectedResult.equals(realResult);
     }
    void mostFrequentWordInArrayTest() {
         String[] test ={ "I go back in my house,because you are not in this house! "};
        System.out.println("Most frequent word in array: " + testResult(stringTester("house",new WordService().mostFrequentWordInArray(test))));
    } void wordServiceTest() {
         String test ="C S H H H J T ";
         System.out.println("Most frequent word in test: " + testResult(stringTester("H", new WordService().findMostFrequentWordInArray(test))));

     }
 }
