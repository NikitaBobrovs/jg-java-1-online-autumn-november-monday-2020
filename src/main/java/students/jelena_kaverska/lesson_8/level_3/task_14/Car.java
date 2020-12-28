package students.jelena_kaverska.lesson_8.level_3.task_14;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}