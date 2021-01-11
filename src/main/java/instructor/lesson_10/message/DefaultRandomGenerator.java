package instructor.lesson_10.message;

import java.util.Random;

public class DefaultRandomGenerator implements RandomGenerator {

    private final Random random = new Random();

    @Override
    public int nextInt(int bound) {
        return random.nextInt(bound);
    }
}
