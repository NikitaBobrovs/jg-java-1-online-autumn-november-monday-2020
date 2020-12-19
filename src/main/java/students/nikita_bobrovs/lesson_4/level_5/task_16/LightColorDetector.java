package students.nikita_bobrovs.lesson_4.level_5.task_16;

class LightColorDetector {

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
        subject.detectTest1();
        subject.detectTest2();
        subject.detectTest3();
        subject.detectTest4();
        subject.detectTest5();
        subject.detectTest6();
        subject.detectTest7();
        subject.detectTest8();
        subject.detectTest9();
    }
    void detectTest1(){
        String testInfo1 = "Detect color (Violet)";
        int number = 410;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(410);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo1);
        } else {
            System.out.println("(FAIL) "+testInfo1);
        }
    }
    void detectTest2(){
        String testInfo2 = "Detect color (Blue)";
        int number = 465;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(465);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo2);
        } else {
            System.out.println("(FAIL) "+testInfo2);
        }
    }
    void detectTest3(){
        String testInfo3 = "Detect color (Green)";
        int number = 501;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(501);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo3);
        } else {
            System.out.println("(FAIL) "+testInfo3);
        }
    }
    void detectTest4(){
        String testInfo4 = "Detect color (Yellow)";
        int number = 575;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(575);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo4);
        } else {
            System.out.println("(FAIL) "+testInfo4);
        }
    }
    void detectTest5(){
        String testInfo5 = "Detect color (Orange)";
        int number = 611;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(610);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo5);
        } else {
            System.out.println("(FAIL) "+testInfo5);
        }
    }
    void detectTest6(){
        String testInfo6 = "Detect color (Red)";
        int number = 730;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(730);
        if (expectedResult == realResult){
            System.out.println("(OK) "+testInfo6);
        } else {
            System.out.println("(FAIL) "+testInfo6);
        }
    }
    void detectTest7() {
        String testInfo7 = "Detect color (Not in range *under*)";
        int number = 200;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(200);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + testInfo7);
        } else {
            System.out.println("(FAIL) " + testInfo7);
        }
    }
    void detectTest8() {
        String testInfo8 = "Detect color (Not in range *over*)";
        int number = 760;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(760);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + testInfo8);
        } else {
            System.out.println("(FAIL) " + testInfo8);
        }
    }
    void detectTest9() {
        String testInfo9 = "Detect color (Not in range *negative num*)";
        int number = -345;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(-245);
        if (expectedResult == realResult) {
            System.out.println("(OK) " + testInfo9);
        } else {
            System.out.println("(FAIL) " + testInfo9);
        }
    }

}
