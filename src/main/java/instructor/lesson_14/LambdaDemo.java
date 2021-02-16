package instructor.lesson_14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.*;

public class LambdaDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> toCube1 = new CubeFunction();

        Function<Integer, Integer> anonymousCube = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                System.out.println("Calculating cube of x: " + x);
                return x * x * x;
            }
        };

        Function<Integer, Integer> lambdaCube = x -> {
            System.out.println("Calculating cube of x: " + x);
            return x * x * x;
        };

        System.out.println("toCube1.apply(3) = " + toCube1.apply(3));
        System.out.println("anonymousCube.apply(3) = " + anonymousCube.apply(3));
        System.out.println("lambdaCube.apply(3) = " + lambdaCube.apply(3));

        System.out.println();
        System.out.println("-= === =-");
        System.out.println();

        Predicate<Integer> isOdd = y -> y % 2 != 0;
        System.out.println("isOdd.test(1) = " + isOdd.test(1));
        System.out.println("isOdd.test(2) = " + isOdd.test(2));

        System.out.println();
        System.out.println("-= === =-");
        System.out.println();

        Consumer<String> printToConsole = s -> System.out.println(s);
        printToConsole.accept("Oh hai");

        System.out.println();
        System.out.println("-= === =-");
        System.out.println();

        Supplier<String> textSupplier = () -> "Hello";
        System.out.println("textSupplier.get() = " + textSupplier.get());

        /*
        JButton button = new JButton();
        button.addActionListener(event -> {
          // Do something when button is pressed
        });
        */
    }
}

class CubeFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        System.out.println("Calculating cube of x: " + x);
        return x * x * x;
    }
}
