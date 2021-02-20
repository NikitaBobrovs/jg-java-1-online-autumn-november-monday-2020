package students.polina_ivashkevich.lesson_14.level_1.task_1;

 class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}


