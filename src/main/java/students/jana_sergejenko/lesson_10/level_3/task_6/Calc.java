package students.jana_sergejenko.lesson_10.level_3.task_6;

public class Calc{
    public static void main(String[] args) {
        MyCalc calc = (num1, num2) -> { return num1 + num2; };
        System.out.println(calc.calculate(4, 5));
    }
}
