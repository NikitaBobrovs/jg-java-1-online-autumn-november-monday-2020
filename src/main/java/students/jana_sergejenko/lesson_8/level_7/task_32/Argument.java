package students.jana_sergejenko.lesson_8.level_7.task_32;

//package teacher.lesson_8_inheritance.homework.level_7_senior.task_32;

class Argument extends MathOperation {

    private double argument;

    public Argument(double argument) {
        this.argument = argument;
    }

    @Override
    public double calculate() {
        return argument;
    }
}