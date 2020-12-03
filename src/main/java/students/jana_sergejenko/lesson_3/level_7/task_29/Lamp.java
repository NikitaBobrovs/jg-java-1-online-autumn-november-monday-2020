package students.jana_sergejenko.lesson_3.level_7.task_29;

class Lamp {

    boolean isOn;
    String color;
    String material;
    Lamp(String color, String material){
        this.color=color;
        this.material=material;
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }
    void printInfo(){
        System.out.println("color: " + this.color+" material: "+this.material+ " isOn: "+isOn);
    }
}

