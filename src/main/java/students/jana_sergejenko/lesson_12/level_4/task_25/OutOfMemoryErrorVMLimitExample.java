package students.jana_sergejenko.lesson_12.level_4.task_25;

public class OutOfMemoryErrorVMLimitExample {
    public static void main(String[] args) {
        int[] array = new int[Integer.MAX_VALUE];

        for(int i = 0; i < array.length; ++i)
            array[i] = i+1;
    }
}
