package students.jekaterina_aleksejeva.lesson_10.level_4.task_12;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}

class FahrenheitConverterTest{
    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.isConvertingToFahrenheit0();
        test.isConvertingToFahrenheit001();
        test.isConvertingToFahrenheit099();
        test.isConvertingToFahrenheit1();
        test.isConvertingToFahrenheitMinus001();
        test.isConvertingToFahrenheitMinus099();
        test.isConvertingToFahrenheitMinus1();

    }
    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == Math.round(actualResult * 100.0) / 100.0;
    }

    TemperatureConverter tc = new FahrenheitConverter();

    void isConvertingToFahrenheit0(){
        String scenario = "Celsius 0 conversion to Fahrenheit = ";
        if (checkBooleanTest(32, tc.convert(0))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToFahrenheit001(){
        String scenario = "Celsius 0,01 conversion to Fahrenheit = ";
        if (checkBooleanTest(32.02, tc.convert(0.01))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToFahrenheit099(){
        String scenario = "Celsius 0,99 conversion to Fahrenheit = ";
        if (checkBooleanTest(33.78, tc.convert(0.99))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToFahrenheit1(){
        String scenario = "Celsius 1 conversion to Fahrenheit = ";
        if (checkBooleanTest(33.8, tc.convert(1))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }
    void isConvertingToFahrenheitMinus001(){
        String scenario = "Celsius -0,01 conversion to Fahrenheit = ";
        if (checkBooleanTest(31.98, tc.convert(-0.01))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToFahrenheitMinus099(){
        String scenario = "Celsius -0,99 conversion to Fahrenheit = ";
        if (checkBooleanTest(30.22, tc.convert(-0.99))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }

    void isConvertingToFahrenheitMinus1(){
        String scenario = "Celsius -1 conversion to Fahrenheit = ";
        if (checkBooleanTest(30.2, tc.convert(-1))){
            System.out.println(scenario + "PASS");}
        else {
            System.out.println(scenario + "FAILED");
        }
    }
}
