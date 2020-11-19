package students.jana_sergejenko.lesson_3.level_5.task_22;


class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Reks", 4,"Brown");
        myDog.voice();
        myDog.changeColor(myDog.newColor);
        myDog.voice();
    }
}