package students.viktors_cesnokovs.lesson_15.level_2.task_5_8;

class QuadraticEq {

    String calc(double a, double b, double c) {
        if (getDiscriminant(a, b, c) > 0) {
            return discriminantGreaterThanZero(getDiscriminant(a, b, c), a, b);
        } else if (getDiscriminant(a, b, c) == 0) {
            return discriminantEqualsZero(a, b);
        }
        return discriminantLessThanZero();
    }


    private double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private String discriminantGreaterThanZero(double discriminant, double a, double b) {
        int x1 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
        int x2 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
        return x1 + ". " + x2;
    }

    private String discriminantEqualsZero(double a, double b) {
        return String.valueOf(((int) (-b / (2 * a))));
    }

    private String discriminantLessThanZero() {
        return "Equation has no roots";
    }
}
