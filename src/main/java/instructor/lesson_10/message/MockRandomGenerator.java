package instructor.lesson_10.message;

public class MockRandomGenerator implements RandomGenerator {

    private final int numberToReturn;

    public MockRandomGenerator(int numberToReturn) {
        this.numberToReturn = numberToReturn;
    }

    @Override
    public int nextInt(int bound) {
        return numberToReturn;
    }
}
