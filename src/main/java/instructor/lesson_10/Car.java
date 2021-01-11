package instructor.lesson_10;

class CarDemo {

    public static void main(String[] args) {

        Car car = new ElectricCar();
        car.accelerate();
        car.decelerate();

    }
}

interface Car {

    void accelerate();

    void decelerate();

}

class PetrolCar implements Car {

    @Override
    public void accelerate() {
        System.out.println("Accelerating as a petrol car");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating as a petrol car");
    }
}

class ElectricCar implements Car {

    @Override
    public void accelerate() {
        System.out.println("Accelerating as a electric car");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating as a electric car");
    }
}
