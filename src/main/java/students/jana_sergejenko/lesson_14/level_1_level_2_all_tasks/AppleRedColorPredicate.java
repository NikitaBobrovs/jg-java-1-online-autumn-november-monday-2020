package students.jana_sergejenko.lesson_14.level_1_level_2_all_tasks;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}