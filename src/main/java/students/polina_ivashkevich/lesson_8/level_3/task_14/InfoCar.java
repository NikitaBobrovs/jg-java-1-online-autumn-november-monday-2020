package students.polina_ivashkevich.lesson_8.level_3.task_14;

public class InfoCar {
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
}
