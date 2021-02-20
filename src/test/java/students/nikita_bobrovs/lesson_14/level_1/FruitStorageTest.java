package students.nikita_bobrovs.lesson_14.level_1;

import org.junit.jupiter.api.Test;
import students.nikita_bobrovs.lesson_14.level_1.predicates.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> inventory = fruitStorage.getAllApples();

    @Test
    void shouldFindGreenApples() {
        List<Apple> test = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        assertThat(fruitStorage.filterApplesByColor(inventory, "green")).isEqualTo(test);
    }

    @Test
    void shouldFindRedApples() {
        List<Apple> test = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        assertThat(fruitStorage.filterApplesByColor(inventory, "red")).isEqualTo(test);
    }

    @Test
    void shouldFindByColorNothing() {
        assertThat(fruitStorage.filterApplesByColor(inventory, "black")).isEmpty();
    }

    @Test
    void shouldFindBySetWeight() {
        List<Apple> test = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        assertThat(fruitStorage.filterApplesByWeight(inventory, 150)).isEqualTo(test);

    }

    @Test
    void shouldFindByWeightNothing(){
        assertThat(fruitStorage.filterApplesByWeight(inventory, 300)).isEmpty();
    }

    @Test
    void shouldFindByGreenColorPredicate(){
        List<Apple> test = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        assertThat(fruitStorage.filterApples(inventory, new AppleGreenColorPredicate())).isEqualTo(test);
    }

    @Test
    void shouldFindByRedColorPredicate(){
        List<Apple> test = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        assertThat(fruitStorage.filterApples(inventory, new AppleRedColorPredicate())).isEqualTo(test);
    }

    @Test
    void shouldFindByLightWeightPredicate(){
        List<Apple> test = List.of(new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50));
        assertThat(fruitStorage.filterApples(inventory, new AppleLightWeightPredicate())).isEqualTo(test);
    }

    @Test
    void shouldFindByHeavyWeightPredicate(){
        List<Apple> test = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        assertThat(fruitStorage.filterApples(inventory, new AppleHeavyWeightPredicate())).isEqualTo(test);
    }

    @Test
    void shouldFindByGreenHeavyPredicate(){
        List<Apple> test = List.of(new Apple("green", 200));
        assertThat(fruitStorage.filterApples(inventory, new AppleGreenAndHeavyWeightPredicate())).isEqualTo(test);
    }

    @Test
    void shouldFindByRedColorAnonymousPredicate(){
        List<Apple> redApples = fruitStorage.filterApples(inventory,
        (Apple apple) -> "red".equals(apple.getColor()));

        List<Apple> test = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        assertThat(test).isEqualTo(redApples);
    }
}