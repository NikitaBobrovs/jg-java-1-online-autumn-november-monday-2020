package students.polina_ivashkevich.lesson_15.level_2.task_5;

public class QuadraticEq {
    private double a;
    private double b;
    private double c;


    public  QuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String calc() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantEqualsZero(a, b);
        } else {
            return discriminantLessZero();

        }
        }

    private String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) /
                (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }
    private String discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantLessZero() {
        return "Equation has no roots";
    }



}
