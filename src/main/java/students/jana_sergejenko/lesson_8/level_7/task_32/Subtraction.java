package students.jana_sergejenko.lesson_8.level_7.task_32;

//package teacher.lesson_8_inheritance.homework.level_7_senior.task_32;

class Subtraction extends TwoArgumentMathOperation {

    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }
}

