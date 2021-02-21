package students.viktors_cesnokovs.lesson_14.level_1_2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class FruitStorageTest {
    FruitStorage storage = new FruitStorage();

    @Test
    void findGreenApples() {
        List<Apple> list = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        List<Apple> apples = storage.getSpecificApples(storage.getAllApples(), apple -> apple.getColor().equals("green"));
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findGreenApplesPredicate() {
        List<Apple> list = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        List<Apple> apples = storage.getSpecificApples1(storage.getAllApples(), new AppleGreenColorPredicate());
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findRedApples() {
        List<Apple> list = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        List<Apple> apples = storage.getSpecificApples(storage.getAllApples(), apple -> apple.getColor().equals("red"));
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findRedApplesPredicate() {
        List<Apple> list = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        List<Apple> apples = storage.getSpecificApples1(storage.getAllApples(), new AppleRedColorPredicate());
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findHeavyApples() {
        List<Apple> list = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        List<Apple> apples = storage.getSpecificApples(storage.getAllApples(), apple -> apple.getWeight() > 150);
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findHeavyApplesPredicate() {
        List<Apple> list = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        List<Apple> apples = storage.getSpecificApples1(storage.getAllApples(), new AppleHeavyWeightPredicate());
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findLightApples() {
        List<Apple> list = List.of(new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50));
        List<Apple> apples = storage.getSpecificApples(storage.getAllApples(), apple -> apple.getWeight() < 150);
        Assertions.assertThat(apples).isEqualTo(list);
    }

    @Test
    void findLightApplesPredicate() {
        List<Apple> list = List.of(new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50));
        List<Apple> apples = storage.getSpecificApples1(storage.getAllApples(), new AppleLightWeightPredicate());
        Assertions.assertThat(apples).isEqualTo(list);
    }
}
