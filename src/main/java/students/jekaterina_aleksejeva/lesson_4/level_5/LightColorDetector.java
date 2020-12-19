package students.jekaterina_aleksejeva.lesson_4.level_5;

class LightColorDetector {

    String detect(int wavelength) {
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
        } else return "Invisible Light";
    }
}
class LightColorDetectorTest{
    public static void main(String[] args) {
        System.out.println( "BREAKDOWN of wavelength boundary value check results:");
        scenarioViolet_1();
        scenarioViolet_2();
        scenarioViolet_3();
        scenarioViolet_4();
        scenarioViolet_5();
        scenarioViolet_6();
        scenarioViolet_7();
        scenarioBlue_1();
        scenarioBlue_2();
        scenarioBlue_3();
        scenarioBlue_4();
        scenarioBlue_5();
        scenarioBlue_6();
        scenarioBlue_7();
        scenarioBlue_8();
        scenarioGreen_1();
        scenarioGreen_2();
        scenarioGreen_3();
        scenarioGreen_4();
        scenarioGreen_5();
        scenarioGreen_6();
        scenarioGreen_7();
        scenarioGreen_8();
        scenarioYellow_1();
        scenarioYellow_2();
        scenarioYellow_3();
        scenarioYellow_4();
        scenarioYellow_5();
        scenarioYellow_6();
        scenarioYellow_7();
        scenarioOrange_1();
        scenarioOrange_2();
        scenarioOrange_3();
        scenarioOrange_4();
        scenarioOrange_5();
        scenarioOrange_6();
        scenarioOrange_7();
        scenarioRed_1();
        scenarioRed_2();
        scenarioRed_3();
        scenarioRed_4();
        scenarioRed_5();
        scenarioRed_6();
        scenarioRed_7();
        scenarioRed_8();
        scenarioInvisible_1();
        scenarioInvisible_2();
        scenarioInvisible_3();
        scenarioInvisible_4();
    }
    static void scenarioViolet_1(){
        String scenario = " colour detection 1 of 7";
        int wavelength = 380;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_2(){
        String scenario = " colour detection 2 of 7";
        int wavelength = 449;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect (wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_3(){
        String scenario = " colour detection 3 of 7";
        int wavelength = 448;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_4(){
        String scenario = " colour detection 4 of 7";
        int wavelength = 381;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_5(){
        String scenario = " colour detection 5 of 7";
        int wavelength = 414;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_6(){
        String scenario = " colour detection 6 of 7";
        int wavelength = 415;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioViolet_7(){
        String scenario = " colour detection 7 of 7";
        int wavelength = 416;
        String expectedResult = "Violet";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_1(){
        String scenario = " colour detection 1 of 8";
        int wavelength = 450;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_2(){
        String scenario = " colour detection 2 of 8";
        int wavelength = 451;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_3(){
        String scenario = " colour detection 3 of 8";
        int wavelength = 471;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_4(){
        String scenario = " colour detection 4 of 8";
        int wavelength = 472;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_5(){
        String scenario = " colour detection 5 of 8";
        int wavelength = 473;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_6(){
        String scenario = " colour detection 6 of 8";
        int wavelength = 474;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_7(){
        String scenario = " colour detection 7 of 8";
        int wavelength = 493;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioBlue_8(){
        String scenario = " colour detection 8 of 8";
        int wavelength = 494;
        String expectedResult = "Blue";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }

    static void scenarioGreen_1(){
        String scenario = " colour detection 1 of 8";
        int wavelength = 495;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_2(){
        String scenario = " colour detection 2 of 8";
        int wavelength = 496;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_3(){
        String scenario = " colour detection 3 of 8";
        int wavelength = 531;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_4(){
        String scenario = " colour detection 4 of 8";
        int wavelength = 532;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_5(){
        String scenario = " colour detection 5 of 8";
        int wavelength = 533;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_6(){
        String scenario = " colour detection 6 of 8";
        int wavelength = 534;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_7(){
        String scenario = " colour detection 7 of 8";
        int wavelength = 568;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioGreen_8(){
        String scenario = " colour detection 8 of 8";
        int wavelength = 569;
        String expectedResult = "Green";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_1(){
        String scenario = " colour detection 1 of 7";
        int wavelength = 570;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_2(){
        String scenario = " colour detection 2 of 7";
        int wavelength = 571;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_3(){
        String scenario = " colour detection 3 of 7";
        int wavelength = 579;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_4(){
        String scenario = " colour detection 4 of 7";
        int wavelength = 580;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_5(){
        String scenario = " colour detection 5 of 7";
        int wavelength = 581;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_6(){
        String scenario = " colour detection 6 of 7";
        int wavelength = 588;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioYellow_7(){
        String scenario = " colour detection 7 of 7";
        int wavelength = 589;
        String expectedResult = "Yellow";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_1(){
        String scenario = " colour detection 1 of 7";
        int wavelength = 590;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_2(){
        String scenario = " colour detection 2 of 7";
        int wavelength = 591;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_3(){
        String scenario = " colour detection 3 of 7";
        int wavelength = 604;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_4(){
        String scenario = " colour detection 4 of 7";
        int wavelength = 605;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_5(){
        String scenario = " colour detection 5 of 7";
        int wavelength = 606;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_6(){
        String scenario = " colour detection 6 of 7";
        int wavelength = 618;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioOrange_7(){
        String scenario = " colour detection 7 of 7";
        int wavelength = 619;
        String expectedResult = "Orange";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_1(){
        String scenario = " colour detection 1 of 8";
        int wavelength = 620;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_2(){
        String scenario = " colour detection 2 of 8";
        int wavelength = 621;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_3(){
        String scenario = " colour detection 3 of 8";
        int wavelength = 635;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_4(){
        String scenario = " colour detection 4 of 8";
        int wavelength = 636;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_5(){
        String scenario = " colour detection 5 of 8";
        int wavelength = 637;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_6(){
        String scenario = " colour detection 6 of 8";
        int wavelength = 638;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_7(){
        String scenario = " colour detection 7 of 8";
        int wavelength = 749;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioRed_8(){
        String scenario = " colour detection 8 of 8";
        int wavelength = 750;
        String expectedResult = "Red";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioInvisible_1(){
        String scenario = " colour detection 1 of 4";
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioInvisible_2(){
        String scenario = " colour detection 2 of 4";
        int wavelength = 752;
        String expectedResult = "Invisible Light";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioInvisible_3(){
        String scenario = " colour detection 3 of 4";
        int wavelength = 378;
        String expectedResult = "Invisible Light";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioInvisible_4(){
        String scenario = " colour detection 4 of 4";
        int wavelength = 379;
        String expectedResult = "Invisible Light";
        String actualResult = new LightColorDetector().detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
}





