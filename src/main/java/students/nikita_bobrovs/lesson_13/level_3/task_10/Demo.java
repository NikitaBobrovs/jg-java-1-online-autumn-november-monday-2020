package students.nikita_bobrovs.lesson_13.level_3.task_10;

public class Demo {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLifeImpl(
                new GameOfLifeConsoleUI(),
                new GameOfLifeRandomFieldGenerator(),
                new GameOfLifeNextGenerationCalculator());
        gameOfLife.run();
    }
}
