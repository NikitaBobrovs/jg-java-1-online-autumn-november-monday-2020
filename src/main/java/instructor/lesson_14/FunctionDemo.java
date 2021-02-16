package instructor.lesson_14;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunc = new SquareFunction();
        Function<Integer, String> intToTextFunc = new IntToTextFunction();

        System.out.println(squareFunc.apply(5));
        System.out.println("intToTextFunc.apply(0) = " + intToTextFunc.apply(0));
        System.out.println("intToTextFunc.apply(1) = " + intToTextFunc.apply(1));
        System.out.println("intToTextFunc.apply(2) = " + intToTextFunc.apply(2));
        System.out.println("intToTextFunc.apply(3) = " + intToTextFunc.apply(3));
        System.out.println("intToTextFunc.apply(4) = " + intToTextFunc.apply(4));
        System.out.println("intToTextFunc.apply(5) = " + intToTextFunc.apply(5));
        System.out.println("intToTextFunc.apply(6) = " + intToTextFunc.apply(6));

    }
}

class SquareFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        return x * x;
    }
}

class IntToTextFunction implements Function<Integer, String> {

    @Override
    public String apply(Integer integer) {
        switch (integer) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            default:
                return "NaN";
        }
    }
}
