package students.viktors_cesnokovs.lesson_14.level_1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findApplesByColor(List<Apple> appleList, String color) {
        return appleList.stream()
                .filter(apple -> apple.getColor().equals(color))
                .collect(toList());
    }

    public List<Apple> findApplesByWeight(List<Apple> appleList, int weight) {
        return appleList.stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(toList());
    }

    public List<Apple> getSpecificApples(List<Apple> appleList, Predicate<Apple> applePredicate) {
        return appleList.stream().filter(applePredicate).collect(toList());
    }

    public List<Apple> getSpecificApples1(List<Apple> appleList, ApplePredicate applePredicate) {
        return appleList.stream().filter(applePredicate::test).collect(toList());
    }
}
