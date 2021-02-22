package students.polina_ivashkevich.lesson_7.level_1.task_1;


public class WordServiceTest {


  public static void main(String[] args) {
   WordServiceTest wordServiceTest = new WordServiceTest();
   wordServiceTest.mostFrequentWordInArrayTest();
   wordServiceTest.wordServiceTest();
  }

  String testResult(boolean tester) {
   if (tester) {
    return "PASS";
   } else {
    return "Fail";
   }
  }

  boolean stringTester(String expectedResult, String realResult) {
   return expectedResult.equals(realResult);
  }

  void mostFrequentWordInArrayTest() {
   String[] test = {"back to moon back with me"};
   System.out.println("Most frequent word in array test : " + testResult(stringTester("back", new WordService().mostFrequentWordInArray(test))));
  }

  void wordServiceTest() {
   String test = "A  C  B C";
   System.out.println("Most frequent word in array test : " + testResult(stringTester("C", new WordService().findMostFrequentWord(test))));
  }
 }