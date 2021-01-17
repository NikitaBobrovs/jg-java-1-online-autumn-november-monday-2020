package students.nikita_bobrovs.lesson_10.level_7.task_25;

//Or else can make this class ABSTRACT. So that we can create different car objects with stated properties.
// class DemoCar extends Car.
// etc...

class Car {
    EngineStrategy engineStrategy;
    DriveStrategy driveStrategy;
    private final String name;

    Car(EngineStrategy engineStrategy, DriveStrategy driveStrategy, String name) {
        this.engineStrategy = engineStrategy;
        this.driveStrategy = driveStrategy;
        this.name = name;
        printName();
    }

    String printName() {
        return this.name;
    }

    String drive() {
        return this.driveStrategy.drive();
    }

    String engine() {
        return this.engineStrategy.engine();
    }
}
