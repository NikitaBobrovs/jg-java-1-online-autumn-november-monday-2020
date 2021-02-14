package students.jana_sergejenko.lesson_14.level_1_level_2_all_tasks;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}