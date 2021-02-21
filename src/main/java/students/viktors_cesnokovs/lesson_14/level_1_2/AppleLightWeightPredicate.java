package students.viktors_cesnokovs.lesson_14.level_1_2;

class AppleLightWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
