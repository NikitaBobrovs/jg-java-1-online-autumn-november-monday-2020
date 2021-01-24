package students.jana_sergejenko.lesson_10.level_4;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.scenario1();
        demo.scenario2();
    }

    public String checkResult(double result, double expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        TemperatureConverter test = new KelvinConverter();
        double result=test.convert(200.00);
        double expected=473.15;
        System.out.println("KelvinConverter: " + checkResult(result, expected));

    }
    public void scenario2() {
        TemperatureConverter test = new FahrenheitConverter();
        double result=test.convert(200.00);
        double expected=392;
        System.out.println("FahrenheitConverter: " + checkResult(result, expected));

    }
}