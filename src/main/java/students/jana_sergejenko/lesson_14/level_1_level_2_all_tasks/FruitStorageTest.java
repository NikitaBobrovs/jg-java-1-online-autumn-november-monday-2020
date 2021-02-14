package students.jana_sergejenko.lesson_14.level_1_level_2_all_tasks;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FruitStorageTest {
    public static void main(String[] args) {
        FruitStorageTest test = new FruitStorageTest();
        test.greenApples();
        test.redApples();
        test.greenAndHeavy();
        test.heavy();
        test.light();
    }

    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> inventory = fruitStorage.getAllApples();

    @Test
    public void greenApples() {

        List<Apple> expected = List.of(new Apple("green", 200), (new Apple("green", 90)), (new Apple("green", 50)));
        List<Apple> result = fruitStorage.findApplesByColor(inventory, "green");
        assertThat(result, is(expected));
        System.out.println(result.equals(expected));
    }

    @Test
    public void redApples() {

        List<Apple> expected = List.of(new Apple("red", 100), (new Apple("red", 160)), (new Apple("red", 200)));
        List<Apple> result = fruitStorage.findApplesByColor(inventory, "red");
        assertThat(result, is(expected));
        System.out.println(result.equals(expected));
    }

    @Test

    public void greenAndHeavy() {
        List<Apple> expected = List.of(new Apple("green", 200));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenAndHeavyWeightPredicate());
        assertThat(result, is(expected));
        System.out.println(result.equals(expected));
    }

    @Test
    public void heavy() {
        List<Apple> expected = List.of(new Apple("red", 160),new Apple("red", 200),new Apple("green", 200),new Apple("yellow", 170));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate());
        assertThat(result, is(expected));
        System.out.println(result.equals(expected));
    }
    @Test
    public void light() {
        List<Apple> expected = List.of(new Apple("red", 100),new Apple("green", 90),new Apple("green", 50),new Apple("yellow", 50));
        List<Apple> result = fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightWeightPredicate());
        assertThat(result, is(expected));
        System.out.println(result.equals(expected));
    }
}