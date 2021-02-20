package students.jekaterina_aleksejeva.lesson_14.level_1_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FruitStorageTest {

    FruitStorage fs = new FruitStorage();
    List<Apple> testList = fs.getAllApples();

    @Test
    void findAllGreenTest() {
        List<Apple> expected = List.of(new Apple("green", 200), new Apple("green", 90), new Apple("green", 50));
        List<Apple> actual = fs.findAppleByColor(testList, "green");
        assertEquals(expected, actual);
    }

    @Test
    void findAllRedTest() {
        List<Apple> expected = List.of(new Apple("red", 100), new Apple("red", 160), new Apple("red", 200));
        List<Apple> actual = fs.findAppleByColor(testList, "red");
        assertEquals(expected, actual);
    }

    @Test
    void findAllYellowTest() {
        List<Apple> expected = List.of(new Apple("yellow", 50), new Apple("yellow", 170));
        List<Apple> actual = fs.findAppleByColor(testList, "yellow");
        assertEquals(expected, actual);
    }

    @Test
    void findHeavierThan150Test() {
        List<Apple> expected = List.of(new Apple("red", 160), new Apple("red", 200), new Apple("green", 200), new Apple("yellow", 170));
        List<Apple> actual = fs.findAppleByWeight(testList, 150);
        assertEquals(expected, actual);
    }

    @Test
    void findHeavierThan170Test() {
        List<Apple> expected = List.of(new Apple("red", 200), new Apple("green", 200));
        List<Apple> actual = fs.findAppleByWeight(testList, 170);
        assertEquals(expected, actual);
    }

    @Test
    void findByGreenColorPredicateTest() {
        List<Apple> expected = List.of(new Apple("green", 200), new Apple("green", 90), new Apple("green", 50));
        List<Apple> actual = fs.findApples(testList, new AppleGreenColorPredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findByRedColorPredicateTest() {
        List<Apple> expected = List.of(new Apple("red", 100), new Apple("red", 160), new Apple("red", 200));
        List<Apple> actual = fs.findApples(testList, new AppleRedColorPredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findByHeavyWeightPredicateTest() {
        List<Apple> expected = List.of(new Apple("red", 160), new Apple("red", 200), new Apple("green", 200), new Apple("yellow", 170));
        List<Apple> actual = fs.findApples(testList, new AppleHeavyWeightPredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findByLightWeightPredicateTest() {
        List<Apple> expected = List.of(new Apple("red", 100), new Apple("green", 90), new Apple("green", 50), new Apple("yellow", 50));
        List<Apple> actual = fs.findApples(testList, new AppleLightWeightPredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findByGreenHeavyPredicateTest() {
        List<Apple> expected = List.of(new Apple("green", 200));
        List<Apple> actual = fs.findApples(testList, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findByGreenAnonPredicateTest() {
        List<Apple> expected = List.of(new Apple("green", 200), new Apple("green", 90), new Apple("green", 50));
        List<Apple> actual = fs.findApples(testList, (Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(expected, actual);
    }

    @Test
    void findByRedAnonPredicateTest() {
        List<Apple> expected = List.of(new Apple("red", 100), new Apple("red", 160), new Apple("red", 200));
        List<Apple> actual = fs.findApples(testList, (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(expected, actual);
    }

}