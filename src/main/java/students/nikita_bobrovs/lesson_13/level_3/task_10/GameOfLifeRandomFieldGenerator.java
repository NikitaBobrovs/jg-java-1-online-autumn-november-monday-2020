package students.nikita_bobrovs.lesson_13.level_3.task_10;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        Random random = new Random();
        boolean[][] randomField = new boolean[fieldWidth][fieldHeight];

        for (int row = 0; row < randomField.length; row++) {
            for (int col = 0; col < randomField[row].length; col++) {
                randomField[row][col] = random.nextBoolean();
            }
        }
        return randomField;
    }
}
