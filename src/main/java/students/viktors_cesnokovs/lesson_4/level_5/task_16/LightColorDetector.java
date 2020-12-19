package students.viktors_cesnokovs.lesson_4.level_5.task_16;

public class LightColorDetector {
    String detect (int waveLength){
        if (waveLength>=380 && waveLength<=449) {
            return "Violet";
        } else if (waveLength>=450 && waveLength<=494){
            return "Blue";
        } else if (waveLength>=495 && waveLength<=569){
            return "Green";
        } else if (waveLength>=570 && waveLength<=589){
            return "Yellow";
        } else if (waveLength>=590 && waveLength<=619){
            return "Orange";
        } else if (waveLength>=620 && waveLength<=750){
            return "Red";
        } else
            return "Invisible Light";
    }
}

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest subject = new LightColorDetectorTest();
        subject.Test1();
        subject.Test2();
        subject.Test3();
        subject.Test4();
        subject.Test5();
        subject.Test6();
        subject.Test7();
        subject.Test8();
        subject.Test9();
    }
    void Test1(){
        String info1 = "Detect color (Violet)";
        int number = 390;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(390);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info1);
        } else {
            System.out.println("(FAIL) "+info1);
        }
    }
    void Test2(){
        String info2 = "Detect color (Blue)";
        int number = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(450);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info2);
        } else {
            System.out.println("(FAIL) "+info2);
        }
    }
    void Test3(){
        String info3 = "Detect color (Green)";
        int number = 525;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(525);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info3);
        } else {
            System.out.println("(FAIL) "+info3);
        }
    }
    void Test4(){
        String info4 = "Detect color (Yellow)";
        int number = 570;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(570);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info4);
        } else {
            System.out.println("(FAIL) "+info4);
        }
    }
    void Test5(){
        String info5 = "Detect color (Orange)";
        int number = 590;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(590);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info5);
        } else {
            System.out.println("(FAIL) "+info5);
        }
    }
    void Test6(){
        String info6 = "Detect color (Red)";
        int number = 750;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(750);
        if (expectedResult == realResult){
            System.out.println("(OK) "+info6);
        } else {
            System.out.println("(FAIL) "+info6);
        }
    }
    void Test7() {
        String info7 = "Detect color (Not in range /under/)";
        int number = 100;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(100);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + info7);
        } else {
            System.out.println("(FAIL) " + info7);
        }
    }
    void Test8() {
        String info8 = "Detect color (Not in range /over/)";
        int number = 800;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(800);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + info8);
        } else {
            System.out.println("(FAIL) " + info8);
        }
    }
    void Test9() {
        String info9 = "Detect color (Not in range /negative number/)";
        int number = -228;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(-163);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + info9);
        } else {
            System.out.println("(FAIL) " + info9);
        }
    }

}
