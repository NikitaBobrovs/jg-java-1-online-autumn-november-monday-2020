package students.nikita_bobrovs.lesson_13.level_3.task_10;

import java.util.Arrays;

class GameOfLifeConsoleUI {
    void show(boolean[][] field) {
        System.out.println(Arrays.deepToString(field)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
                .replace(",", "")
                .replace("true", "o")
                .replace("false", "."));
    }
}
