package students.jana_sergejenko.lesson_3.level_5.task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor=dogColor;
    }

    public void voice(){
        System.out.println("Dog name: " + this.dogName + "\ndog age: " + this.dogAge + "\ndog color "+dogColor);
    }
}