package students.jana_sergejenko.lesson_3.level_7.task_29;

public class Auto {
    String brand;
    String model;
    int speed=100;
    int accelerate;
    int brake;

    Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void accelerate(){
        accelerate=speed +50;
    }
    void brake(){
        brake=speed -50;
    }

    void printInfo() {
        System.out.println("Auto brand: " + this.brand+" model: "+this.model+ " accelerate: "+accelerate+" brake "+brake);
    }
}
