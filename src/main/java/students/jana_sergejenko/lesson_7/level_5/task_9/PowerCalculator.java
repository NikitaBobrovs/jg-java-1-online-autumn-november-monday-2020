package students.jana_sergejenko.lesson_7.level_5.task_9;

public class PowerCalculator {

    public static double power(double x, int n){
        int i = 1;
        double y = 1.0;
        while(i<=n){
            i = i+1;
            y = y*x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
