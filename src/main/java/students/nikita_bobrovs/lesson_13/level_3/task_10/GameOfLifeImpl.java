package students.nikita_bobrovs.lesson_13.level_3.task_10;

import java.util.concurrent.TimeUnit;

public class GameOfLifeImpl implements GameOfLife {

    private final GameOfLifeConsoleUI ui;
    private final GameOfLifeRandomFieldGenerator generator;
    private final GameOfLifeNextGenerationCalculator calculator;

    public GameOfLifeImpl(GameOfLifeConsoleUI ui,
                          GameOfLifeRandomFieldGenerator generator,
                          GameOfLifeNextGenerationCalculator calculator) {
        this.ui = ui;
        this.generator = generator;
        this.calculator = calculator;
    }

    @Override
    public void run() {
        boolean[][] field = generator.generate(5, 5);
        while (true) {
            ui.show(field);
            System.out.println("+++++++++++++++++++++++");
            sleepForSeconds(2);
            calculator.calculate(field);
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
