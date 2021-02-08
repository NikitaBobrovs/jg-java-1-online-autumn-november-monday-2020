package instructor.lesson_14;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEvenFunc = new EvenPredicate();

        System.out.println("isEvenFunc.test(1) = " + isEvenFunc.test(1));
        System.out.println("isEvenFunc.test(2) = " + isEvenFunc.test(2));

    }
}

class EvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
}
