package students.nikita_bobrovs.lesson_10.level_7.task_25;

class RecklessDriveStrategyTest {
    public static void main(String[] args) {
        RecklessDriveStrategyTest recklessDriveStrategyTest = new RecklessDriveStrategyTest();
        recklessDriveStrategyTest.recklessDriveStrategyTest1();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }


    void recklessDriveStrategyTest1() {
        Car car = new Car(new PetrolEngineStrategy(), new RecklessDriveStrategy("Niko"), "Car number 2.");
        String expected = "Car number 2.Niko is driving recklessly.";
        System.out.println("Reckless drive test : " + testResult(expected.equals(car.printName() + car.drive())));
    }

}
