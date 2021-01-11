package instructor.lesson_10;

import java.util.Scanner;

public class CarEngine {

    public static void main(String[] args) {

        System.out.println("Enter engine type:");
        System.out.println("1 - Petrol");
        System.out.println("2 - Diesel");

        Scanner scanner = new Scanner(System.in);
        int engineType = scanner.nextInt();

        Vehicle vehicle = new Vehicle();

        switch (engineType) {
            case 1:
                vehicle.engine = new PetrolEngine();
                break;
            case 2:
                vehicle.engine = new DieselEngine();
                break;
        }

        vehicle.turnOn();
        vehicle.turnOff();

    }
}

class Vehicle {

    Engine engine;

    void turnOn() {
        System.out.println("Vehicle turnOn");
        engine.start();
    }

    void turnOff() {
        System.out.println("Vehicle turnOff");
        engine.stop();
    }
}

interface Engine {

    void start();

    void stop();
}

class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stop");
    }
}

class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine Stop");
    }
}
