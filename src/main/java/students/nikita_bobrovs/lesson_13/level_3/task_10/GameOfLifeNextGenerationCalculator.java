package students.nikita_bobrovs.lesson_13.level_3.task_10;

/*
rule 1 - Any live cell with fewer than two live neighbours dies, as if by underpopulation.
rule 2 - Any live cell with more than three live neighbours dies, as if by overpopulation.
rule 3 - Any live cell with two or three live neighbours lives on to the next generation.
rule 4 - Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */
class GameOfLifeNextGenerationCalculator {

    private void whenIsAlive(boolean[][] currentGeneration, int row, int col, int neighbourCount) {
        if (currentGeneration[row][col]) {
            //rule 1
            if (neighbourCount < 2) {
                currentGeneration[row][col] = false;
            }
            //rule 2
            if (neighbourCount > 3) {
                currentGeneration[row][col] = false;
            }
            //rule 3
            if (neighbourCount == 2 || neighbourCount == 3) {
                currentGeneration[row][col] = true;
            }
        }
    }

    private void whenIsDead(boolean[][] currentGeneration, int row, int col, int neighbourCount) {
        if (!currentGeneration[row][col]) {
            //rule 4
            if (neighbourCount == 3) {
                currentGeneration[row][col] = true;
            }
        }
    }

    private void applyRules(boolean[][] currentGeneration) {
        for (int row = 0; row < currentGeneration.length; row++) {
            for (int col = 0; col < currentGeneration[row].length; col++) {
                int neighbourCount = countNeighbours(currentGeneration, row, col);
                whenIsAlive(currentGeneration, row, col, neighbourCount);
                whenIsDead(currentGeneration, row, col, neighbourCount);
            }
        }
    }

    private int countNeighbours(boolean[][] currentGeneration, int row, int col) {
        int neighbourCount = 0;
        if (inBounds(row - 1, col, currentGeneration.length)) {
            if (currentGeneration[row - 1][col]) {
                neighbourCount += 1;
            }
        }

        if (inBounds(row - 1, col + 1, currentGeneration.length)) {
            if (currentGeneration[row - 1][col + 1]) {
                neighbourCount += 1;
            }
        }
        if (inBounds(row, col + 1, currentGeneration.length)) {
            if (currentGeneration[row][col + 1]) {
                neighbourCount += 1;
            }
        }

        if (inBounds(row + 1, col + 1, currentGeneration.length)) {
            if (currentGeneration[row + 1][col + 1]) {
                neighbourCount += 1;
            }
        }

        if (inBounds(row + 1, col, currentGeneration.length)) {
            if (currentGeneration[row + 1][col]) {
                neighbourCount += 1;
            }
        }

        if (inBounds(row + 1, col - 1, currentGeneration.length)) {
            if (currentGeneration[row + 1][col - 1]) {
                neighbourCount += 1;
            }

        }

        if (inBounds(row, col - 1, currentGeneration.length)) {
            if (currentGeneration[row][col - 1]) {
                neighbourCount += 1;
            }
        }

        if (inBounds(row - 1, col - 1, currentGeneration.length)) {
            if (currentGeneration[row - 1][col - 1]) {
                neighbourCount += 1;
            }
        }
        return neighbourCount;
    }

    private boolean inBounds(int row, int col, int fieldSize) {
        if (row < 0 || row >= fieldSize) {
            return false;
        }
        return col >= 0 && col < fieldSize;
    }

    void calculate(boolean[][] currentGeneration) {
        applyRules(currentGeneration);
    }
}