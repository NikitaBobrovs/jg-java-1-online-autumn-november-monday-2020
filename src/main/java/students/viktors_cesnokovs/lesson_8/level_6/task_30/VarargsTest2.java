package students.viktors_cesnokovs.lesson_8.level_6.task_30;

public class VarargsTest2 {
    static int sum(int... array) {
        int sum, i;
        sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum);
    }

    public static void main(String args[]) {
        int sum = 0;
        sum = sum(new int[]{20, 20, 30});
        System.out.println("Sum of numbers : " + sum);
    }
}
