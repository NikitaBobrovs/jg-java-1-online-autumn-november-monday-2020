package students.jana_sergejenko.lesson_11.level_1.task_1.task_2;

import java.util.ArrayList;

public class CarArray {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "e46");
        Car c2 = new Car("Audi", "quattro");
        Car c3 = new Car("Suzuki", "WRX");

        ArrayList<Car> carlist = new ArrayList<Car>();

        carlist.add(c1);
        carlist.add(c2);
        carlist.add(c3);

        for (Car c : carlist) {
            System.out.println(c);
        }
    }
}
