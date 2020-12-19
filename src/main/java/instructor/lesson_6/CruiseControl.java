package instructor.lesson_6;

import java.util.Random;

class CruiseControl {

    public static void main(String[] args) {

        Passenger[] passengers = new Passenger[20];
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = new Passenger("Passenger " + i);
        }

        // old - fashioned way
//        for (int i = 0; i < passengers.length; i++) {
//            passengers[i].printInfo();
//        }

        // pro - fashioned way
        for (Passenger passenger : passengers) {
            passenger.printInfo();
        }

/*        System.out.println("Screening...");
        int idx = 0;
        while (passengers[idx].isHealthy()) {
            System.out.print("Boarding.. ");
            passengers[idx].printInfo();
            idx++;
        }*/

//        for (int i = 0; i < passengers.length; i++) {
//            if (passengers[i].isSick()) {
//                System.out.println("Sick!");
//                passengers[i].printInfo();
//                break;
//            }
//        }

    }
}

class Passenger {

    String name;
    double temperature;

    Passenger(String name) {
        this.name = name;
        this.temperature = new Random().nextDouble() * 4 + 36.0;
    }

    public boolean isHealthy() {
        return temperature < 39.0;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", temperature: " + temperature);
    }

    // 0.0 * 4 + 36.0 => 36.0
    // 0.5 * 4 + 36.0 => 2.0 + 36.0 = 38.0
    // 1.0 * 4 + 36.0 => 40.0

}
