package students.jelena_kaverska.lesson_4.level_7.task_25;

class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}

class LightColorDetectorTest {

    LightColorDetector lightColor = new LightColorDetector();

    static boolean checkResult(String actual, String expected) {
        return actual.equals(expected);
    }

    static String print(boolean result) {
        if (result) {
            return "OK";
        }
        return "FAIL";
    }

    public void testViolet(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Violet " + print(checkResult(result, "Violet")));
    }

    public void testBlue(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Blue " + print(checkResult(result, "Blue")));
    }

    public void testGreen(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Green " + print(checkResult(result, "Green")));
    }

    public void testYellow(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Yellow " + print(checkResult(result, "Yellow")));
    }

    public void testOrange(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Orange " + print(checkResult(result, "Orange")));
    }

    public void testRed(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Red " + print(checkResult(result, "Red")));
    }

    public void testInvisible(int wavelength) {
        String result = lightColor.detect(wavelength);
        System.out.println("LightColorDetector test - Invisible Light " + print(checkResult(result, "Invisible Light")));
    }

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
}