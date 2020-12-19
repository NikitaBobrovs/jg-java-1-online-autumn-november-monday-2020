package students.jana_sergejenko.lesson_3.level_7.task_33;

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getModel(){
        return this.model;
    }
    String getManufacturer(){
        return this.manufacturer;
    }

}