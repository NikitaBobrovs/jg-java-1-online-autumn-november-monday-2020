package students.nikita_bobrovs.lesson_13.level_3.task_10;

import java.util.concurrent.TimeUnit;

public class GameOfLife {
    private final GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private final GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private final GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(5, 5);
        while (true) {
            ui.show(field);
            System.out.println("+++++++++++++++++++++++");
            sleepForSeconds(2);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }
}
