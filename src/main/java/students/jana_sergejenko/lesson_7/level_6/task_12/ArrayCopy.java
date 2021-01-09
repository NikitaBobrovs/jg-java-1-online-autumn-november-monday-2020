package students.jana_sergejenko.lesson_7.level_6.task_12;

public class ArrayCopy {
    public static int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > numberFrom - 1 && in[i] < numberTo + 1) {
                count++;
            }
        }
        int copyArray[] = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > numberFrom - 1 && in[i] < numberTo + 1) {
                copyArray[index] = in[i];
                index++;
            }
        }
        return copyArray;
    }

    public static void main(String[] args) {
        int b[] = {1, 2, 3, 4, 5, 6, 7};
        int[] c = copyInRange(b, 3, 6);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
