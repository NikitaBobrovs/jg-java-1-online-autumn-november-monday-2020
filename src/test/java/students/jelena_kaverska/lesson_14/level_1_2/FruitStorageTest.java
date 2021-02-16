package students.jelena_kaverska.lesson_14.level_1_2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FruitStorageTest {

    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void testAllGreen() {
        List<Apple> exp = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        List<Apple> act = fruitStorage.getSpecificApples(fruitStorage.getAllApples(), a -> a.getColor().equals("green"));
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllGreenPredicate() {
        List<Apple> exp = List.of(new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50));
        List<Apple> act = fruitStorage.getSpecificApples_1(fruitStorage.getAllApples(), new AppleGreenColorPredicate());
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllRed() {
        List<Apple> exp = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        List<Apple> act = fruitStorage.getSpecificApples(fruitStorage.getAllApples(), a -> a.getColor().equals("red"));
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllRedPredicate() {
        List<Apple> exp = List.of(new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200));
        List<Apple> act = fruitStorage.getSpecificApples_1(fruitStorage.getAllApples(), new AppleRedColorPredicate());
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllHeavyWeight() {
        List<Apple> exp = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        List<Apple> act = fruitStorage.getSpecificApples(fruitStorage.getAllApples(), a -> a.getWeight() > 150);
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllHeavyWeightPredicate() {
        List<Apple> exp = List.of(new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170));
        List<Apple> act = fruitStorage.getSpecificApples_1(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate());
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllLightWeight() {
        List<Apple> exp = List.of(new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50));
        List<Apple> act = fruitStorage.getSpecificApples(fruitStorage.getAllApples(), a -> a.getWeight() < 150);
        Assertions.assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllLightWeightPredicate() {
        List<Apple> exp = List.of(new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50));
        List<Apple> act = fruitStorage.getSpecificApples_1(fruitStorage.getAllApples(), new AppleLightWeightPredicate());
        Assertions.assertThat(act).isEqualTo(exp);
    }
}