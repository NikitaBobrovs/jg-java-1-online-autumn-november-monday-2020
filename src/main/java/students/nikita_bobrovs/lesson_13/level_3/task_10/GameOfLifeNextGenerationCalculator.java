package students.nikita_bobrovs.lesson_13.level_3.task_10;

/*
1 - Any live cell with fewer than two live neighbours dies, as if by underpopulation.
2 - Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
3 - Any live cell with more than three live neighbours dies, as if by overpopulation.
4 - Any live cell with two or three live neighbours lives on to the next generation.
 */
class GameOfLifeNextGenerationCalculator {

    void rules(boolean[][] currentGeneration) {
        for (int row = 0; row < currentGeneration.length; row++) {
            for (int col = 0; col < currentGeneration[row].length; col++) {
                int neighbourCount = getNeighbours(currentGeneration, row, col);

                if (currentGeneration[row][col]) {
                    if (neighbourCount < 2) {
                        currentGeneration[row][col] = false;
                    }
                    if (neighbourCount < 3) {
                        currentGeneration[row][col] = false;
                    }
                    if (neighbourCount == 2 || neighbourCount == 3) {
                        currentGeneration[row][col] = true;
                    }
                }
                if (!currentGeneration[row][col]) {
                    if (neighbourCount == 3) {
                        currentGeneration[row][col] = true;
                    }
                }
            }
        }
    }

    int getNeighbours(boolean[][] currentGeneration, int row, int col) {
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


    boolean inBounds(int row, int col, int fieldSize) {
        if (row < 0 || row >= fieldSize) {
            return false;
        } else if (col < 0 || col >= fieldSize) {
            return false;
        }
        return true;
    }

    public boolean[][] calculate(boolean[][] currentGeneration) {

        rules(currentGeneration);

        return currentGeneration;
    }
}