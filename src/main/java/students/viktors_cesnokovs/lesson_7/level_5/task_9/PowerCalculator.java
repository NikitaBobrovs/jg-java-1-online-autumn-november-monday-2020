package students.viktors_cesnokovs.lesson_7.level_5.task_9;

public class PowerCalculator {
    int power(int N, int P) {
        if (P == 0) {
            return 0;
        } else
            return positivePower(N, P);
    }

    int positivePower(int N, int P) {
        int pow = 1;
        if (P > 0) ;
        {
            for (int i = 1; i <= P; i++) {
                pow *= N;
            }
        }
        return pow;
    }
}
