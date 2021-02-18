package students.polina_ivashkevich.lesson_14.level_1.task_1;

 class AppleHeavyWeightPredicate implements ApplePredicate{
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}

