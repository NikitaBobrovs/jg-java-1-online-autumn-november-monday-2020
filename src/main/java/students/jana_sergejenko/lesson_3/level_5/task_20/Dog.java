package students.jana_sergejenko.lesson_3.level_5.task_20;

class Dog{

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getVoice() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    void happyBirthday() {
        this.age=this.age+1;
    }
}