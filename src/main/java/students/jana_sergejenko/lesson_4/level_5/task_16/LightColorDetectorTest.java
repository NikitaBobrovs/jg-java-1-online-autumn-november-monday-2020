package students.jana_sergejenko.lesson_4.level_5.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest calculatorTest = new LightColorDetectorTest();
        LightColorDetectorTest.testViolet();
        LightColorDetectorTest.testBlue();
        LightColorDetectorTest.testGreen();
        LightColorDetectorTest.testYellow();
        LightColorDetectorTest.testOrange();
        LightColorDetectorTest.testRed();
        LightColorDetectorTest.testInvisibleLight();
    }
        static void testViolet() {
            int wavelength=382;
            String expectedResult = "Violet";
            LightColorDetector detector = new LightColorDetector();
            String realResult = detector.detect(wavelength);
            if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
                System.out.println("Sum test = OK");
            } else {
                System.out.println("Sum test = FAIL");
            }
        }
    static void testBlue() {
        int wavelength=470;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void testGreen() {
        int wavelength=500;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void testYellow() {
        int wavelength=572;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void testOrange() {
        int wavelength=600;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void testRed() {
        int wavelength=720;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    static void testInvisibleLight() {
        int wavelength=100;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

}
