package students.jekaterina_aleksejeva.lesson_10.level_4.task_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}

class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.isConvertingToKelvin0();
        test.isConvertingToKelvin001();
        test.isConvertingToKelvin099();
        test.isConvertingToKelvin1();
        test.isConvertingToKelvinMinus001();
        test.isConvertingToKelvinMinus099();
        test.isConvertingToKelvinMinus1();

    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == Math.round(actualResult * 100.0) / 100.0;
    }

    TemperatureConverter tc = new KelvinConverter();

    void isConvertingToKelvin0() {
        String scenario = "Celsius 0 conversion to Kelvin = ";
        if (checkBooleanTest(273.15, tc.convert(0))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvin001() {
        String scenario = "Celsius 0,01 conversion to Kelvin = ";
        if (checkBooleanTest(273.16, tc.convert(0.01))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvin099() {
        String scenario = "Celsius 0,99 conversion to Kelvin = ";
        if (checkBooleanTest(274.14, tc.convert(0.99))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvin1() {
        String scenario = "Celsius 1 conversion to Kelvin = ";
        if (checkBooleanTest(274.15, tc.convert(1))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvinMinus001() {
        String scenario = "Celsius -0,01 conversion to Kelvin = ";
        if (checkBooleanTest(273.14, tc.convert(-0.01))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvinMinus099() {
        String scenario = "Celsius -0,99 conversion to Kelvin = ";
        if (checkBooleanTest(272.16, tc.convert(-0.99))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToKelvinMinus1() {
        String scenario = "Celsius -1 conversion to Kelvin = ";
        if (checkBooleanTest(272.15, tc.convert(-1))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

}
