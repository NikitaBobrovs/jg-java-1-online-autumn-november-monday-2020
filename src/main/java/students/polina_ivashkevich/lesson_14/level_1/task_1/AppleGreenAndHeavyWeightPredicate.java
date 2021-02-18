package students.polina_ivashkevich.lesson_14.level_1.task_1;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}