package students.jana_sergejenko.lesson_4.level_7.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);

    }

    public String checkResult(String result, String expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void testViolet(int wavelength) {
        System.out.println("LightColorDetector test - Violet" + checkResult(new LightColorDetector().detect(wavelength), "Violet"));
    }

    public void testBlue(int wavelength) {
        System.out.println("LightColorDetector test - Blue" + checkResult(new LightColorDetector().detect(wavelength), "Blue"));
    }

    public void testGreen(int wavelength) {
        System.out.println("LightColorDetector test - Green" + checkResult(new LightColorDetector().detect(wavelength), "Green"));
    }

    public void testYellow(int wavelength) {
        System.out.println("LightColorDetector test - Yellow" + checkResult(new LightColorDetector().detect(wavelength), "Yellow"));
    }

    public void testOrange(int wavelength) {
        System.out.println("LightColorDetector test - Orange" + checkResult(new LightColorDetector().detect(wavelength), "Orange"));
    }

    public void testRed(int wavelength) {
        System.out.println("LightColorDetector test - Red" + checkResult(new LightColorDetector().detect(wavelength), "Red"));

    }

    public void testInvisible(int wavelength) {
        System.out.println("LightColorDetector test - Invisible Light" + checkResult(new LightColorDetector().detect(wavelength), "Invisible Light"));
    }
}

