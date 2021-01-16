package students.nikita_bobrovs.lesson_10.level_7.task_25;

class CarefulDriveStrategyTest {
    public static void main(String[] args) {
        CarefulDriveStrategyTest carefulDriveStrategyTest = new CarefulDriveStrategyTest();
        carefulDriveStrategyTest.carefulDriveStrategyTest1();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }


    void carefulDriveStrategyTest1() {
        Car car = new Car(new PetrolEngineStrategy(), new CarefulDriveStrategy("Nik"), "Car number 1.");
        String expected = "Car number 1.Nik is driving carefully.";
        System.out.println("Careful drive test : " + testResult(expected.equals(car.printName() + car.drive())));
    }

}
