package students.jana_sergejenko.lesson_14.level_1_level_2_all_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> inventory = fruitStorage.getAllApples();

    public void greenApples() {

        List<Apple> expected = List.of(new Apple("green", 200), (new Apple("green", 90)), (new Apple("green", 50)));
        List<Apple> result = fruitStorage.findApplesByColor(inventory, "green");
        assertThat(result).isEqualTo(expected);
        System.out.println(result.equals(expected));
    }

    @Test
    public void redApples() {

        List<Apple> expected = List.of(new Apple("red", 100), (new Apple("red", 160)), (new Apple("red", 200)));
        List<Apple> result = fruitStorage.findApplesByColor(inventory, "red");
        assertThat(result).isEqualTo(expected);
        System.out.println(result.equals(expected));
    }

    @Test
    public void greenAndHeavy() {
        List<Apple> expected = List.of(new Apple("green", 200));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenAndHeavyWeightPredicate());
        assertThat(result).isEqualTo(expected);
        System.out.println(result.equals(expected));
    }

    @Test
    public void heavy() {
        List<Apple> expected = List.of(new Apple("red", 160),new Apple("red", 200),new Apple("green", 200),new Apple("yellow", 170));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate());
        assertThat(result).isEqualTo(expected);
        System.out.println(result.equals(expected));
    }
    @Test
    public void light() {
        List<Apple> expected = List.of(new Apple("red", 100),new Apple("green", 90),new Apple("green", 50),new Apple("yellow", 50));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightWeightPredicate());
        assertThat(result).isEqualTo(expected);
        System.out.println(result.equals(expected));
    }
}
