package students.polina_ivashkevich.lesson_4.level_5.task_16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        scenarioViolet_1();
        scenarioViolet_2();
        scenarioViolet_3();
        scenarioBlue_1();
        scenarioBlue_2();
        scenarioBlue_3();
        scenarioGreen_1();
        scenarioGreen_2();
        scenarioGreen_3();
        scenarioYellow_1();
        scenarioYellow_2();
        scenarioYellow_3();
        scenarioOrange_1();
        scenarioOrange_2();
        scenarioOrange_3();
        scenarioRed_1();
        scenarioRed_2();
        scenarioRed_3();
        scenarioInvisibleLight_1();
        scenarioInvisibleLight_2();
        scenarioInvisibleLight_3();


    }


    static void scenarioViolet_1() {
        String scenario = "color detection ";
        int wavelength = 380;
        String expectResult = "Violet";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }


    static void scenarioViolet_2() {
        String scenario = "color detection ";
        int wavelength = 449;
        String expectResult = "Violet";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok" + scenario + realResult);
        } else {
            System.out.println("Fail" + scenario + realResult);
        }


    }

    static void scenarioViolet_3() {
        String scenario = "color detection ";
        int wavelength = 415;
        String expectResult = "Violet";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }
    }

    static void scenarioBlue_1() {
        String scenario = "color detection ";
        int wavelength = 450;
        String expectResult = "Blue";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok" + scenario + realResult);
        } else {
            System.out.println("Fail" + scenario + realResult);
        }
    }

    static void scenarioBlue_2() {
        String scenario = "color detection ";
        int wavelength = 496;
        String expectResult = "Blue";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }
    }

    static void scenarioBlue_3() {
        String scenario = "color detection ";
        int wavelength = 475;
        String expectResult = "Violet";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }

    static void scenarioGreen_1() {
        String scenario = "color detection ";
        int wavelength = 495;
        String expectResult = "Green";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail" + scenario + realResult);
        }
    }

    static void scenarioGreen_2() {
        String scenario = "color detection ";
        int wavelength = 569;
        String expectResult = "Green";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }


    static void scenarioGreen_3() {
        String scenario = "color detection ";
        int wavelength = 525;
        String expectResult = "Green";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail" + scenario + realResult);
        }

    }

    static void scenarioYellow_1() {
        String scenario = "color detection ";
        int wavelength = 570;
        String expectResult = "Yellow";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }
    }

    static void scenarioYellow_2() {
        String scenario = "color detection ";
        int wavelength = 589;
        String expectResult = "Yellow";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }
    }

    static void scenarioYellow_3() {
        String scenario = "color detection ";
        int wavelength = 578;
        String expectResult = "Yellow";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioOrange_1() {
        String scenario = "color detection ";
        int wavelength = 590;
        String expectResult = "Orange";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioOrange_2() {
        String scenario = "color detection ";
        int wavelength = 619;
        String expectResult = "Orange";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioOrange_3() {
        String scenario = "color detection ";
        int wavelength = 605;
        String expectResult = "Orange";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail" + scenario + realResult);
        }

    }static void scenarioRed_1() {
        String scenario = "color detection ";
        int wavelength = 620;
        String expectResult = "Red ";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioRed_2() {
        String scenario = "color detection ";
        int wavelength = 750;
        String expectResult = "Red";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioRed_3() {
        String scenario = "color detection ";
        int wavelength = 690;
        String expectResult = "Red";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioInvisibleLight_1() {
        String scenario = "color detection ";
        int wavelength = 751;
        String expectResult = "Invisible light";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioInvisibleLight_2() {
        String scenario = "color detection ";
        int wavelength = 752;
        String expectResult = "Invisible light";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }static void scenarioInvisibleLight_3() {
        String scenario = "color detection ";
        int wavelength = 753;
        String expectResult = "Invisible light";
        String realResult = new LightColorDetector().detect(wavelength);
        if (expectResult.equals(realResult)) {
            System.out.println("Ok " + scenario + realResult);
        } else {
            System.out.println("Fail " + scenario + realResult);
        }

    }
}



