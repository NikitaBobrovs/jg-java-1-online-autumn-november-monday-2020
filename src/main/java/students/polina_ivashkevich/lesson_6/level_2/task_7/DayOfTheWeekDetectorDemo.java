package students.polina_ivashkevich.lesson_6.level_2.task_7;


import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector=new DayOfTheWeekDetector();
        detector.getDayNumberFromUser();


    }
}
class  DayOfTheWeekDetector{
    public String findDayOfTheWeek(int dayNumber){
        switch(dayNumber){
            case 1 :
               return "Monday";
            case 2:
                return "Tuesday";
            case 3 :
                    return "Wednesday";
            case 4 :
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7 :
                return "Sunday";
            default :
                return "Not correct day number";


            }
        }

    public  int getDayNumberFromUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }
}
class DayOfTheWeekDetectorTest{
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    public String printResult(boolean result) {
        if (result) {
            return "Ok";
        }
        return "Fail";
    }

    public boolean compareResults(String expected, String actual) {
        return expected.equalsIgnoreCase(actual);
    }

    public void testDay(String expectedDay, int dayNumber) {
        String actual = detector.findDayOfTheWeek(dayNumber);
        System.out.println(expectedDay + " test: " + printResult(compareResults(expectedDay, actual)));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest detectorTest = new DayOfTheWeekDetectorTest();
        detectorTest.testDay("Monday", 1);
        detectorTest.testDay("Tuesday", 2);
        detectorTest.testDay("Wednesday", 3);
        detectorTest.testDay("Thursday", 4);
        detectorTest.testDay("Friday", 5);
        detectorTest.testDay("Saturday", 6);
        detectorTest.testDay("Sunday", 7);
        detectorTest.testDay("Not correct day number", 10);
    }
}





