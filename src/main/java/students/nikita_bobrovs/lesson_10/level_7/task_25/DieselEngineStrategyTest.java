package students.nikita_bobrovs.lesson_10.level_7.task_25;

class DieselEngineStrategyTest {
    public static void main(String[] args) {
        DieselEngineStrategyTest dieselEngineStrategyTest = new DieselEngineStrategyTest();
        dieselEngineStrategyTest.dieselEngineStrategyTest1();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    void dieselEngineStrategyTest1() {
        Car car = new Car(new DieselEngineStrategy(), new RecklessDriveStrategy("Niko"), "Car number 3.");
        String expected = "Car number 3.Please fill with diesel.";
        System.out.println("Diesel engine strategy test : " + testResult
                (expected.equals(car.printName() + car.engine())));
    }
}
