package students.jana_sergejenko.lesson_11.task_2;

//Коллекции могут хранить любые ссылочные типы данных.
public class Car {
    String name;
    String model;

    Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                "model='" + model + '\'' +
                '}';
    }
}

