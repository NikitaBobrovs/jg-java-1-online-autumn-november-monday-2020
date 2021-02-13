package students.nikita_bobrovs.lesson_13.level_3.task_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    @Test
    void shouldDieIfLessThanTwoNeighboursForWhenAlive() {
        boolean[][] currentGeneration = new boolean[5][5];
        currentGeneration[1][1] = true;
        currentGeneration[1][2] = true;
        calculator.calculate(currentGeneration);
        assertFalse(currentGeneration[1][1]);
        assertFalse(currentGeneration[1][2]);
    }

    @Test
    void shouldDieIfMoreThanThreeNeighboursForWhenAlive() {
        boolean[][] currentGeneration = new boolean[5][5];
        currentGeneration[2][2] = true;
        currentGeneration[2][1] = true;
        currentGeneration[1][1] = true;
        currentGeneration[1][2] = true;
        calculator.calculate(currentGeneration);
        assertTrue(currentGeneration[2][2]);
    }

    @Test
    void shouldLiveIfHasTwoOrThreeNeighboursForWhenAlive() {
        boolean[][] currentGeneration = new boolean[5][5];
        currentGeneration[0][0] = true;
        currentGeneration[0][1] = true;
        currentGeneration[1][0] = true;
        currentGeneration[1][1] = true;
        calculator.calculate(currentGeneration);
        assertTrue(currentGeneration[0][0]);
    }

    @Test
    void shouldBecomeAliveIfThreeNeighboursForWhenDead() {
        boolean[][] currentGeneration = new boolean[5][5];
        currentGeneration[0][1] = true;
        currentGeneration[1][0] = true;
        currentGeneration[1][1] = true;
        calculator.calculate(currentGeneration);
        assertTrue(currentGeneration[0][0]);
    }
}