package students.nikita_bobrovs.lesson_10.level_7.task_25;

class PetrolEngineStrategyTest {
    public static void main(String[] args) {
        PetrolEngineStrategyTest petrolEngineStrategyTest = new PetrolEngineStrategyTest();
        petrolEngineStrategyTest.petrolEngineStrategyTest1();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    void petrolEngineStrategyTest1() {
        Car car = new Car(new PetrolEngineStrategy(), new RecklessDriveStrategy("Niko"), "Car number 4.");
        String expected = "Car number 4.Please fill with petrol.";
        System.out.println("Petrol engine strategy test : " + testResult
                (expected.equals(car.printName() + car.engine())));
    }
}
