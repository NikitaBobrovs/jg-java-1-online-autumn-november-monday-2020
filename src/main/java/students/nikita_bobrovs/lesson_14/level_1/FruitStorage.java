package students.nikita_bobrovs.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    List<Apple> filterApplesByColor(List<Apple> storage, String color) {
        return storage.stream()
                .filter(apple -> apple.getColor().equals(color))
                .collect(Collectors.toList());
    }

    List<Apple> filterApplesByWeight(List<Apple> storage, int weight){
        return storage.stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }

    public List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        return inventory.stream().filter(p::test).collect(Collectors.toList());
    }
}
