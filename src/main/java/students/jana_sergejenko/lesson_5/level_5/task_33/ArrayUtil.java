package students.jana_sergejenko.lesson_5.level_5.task_33;

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
    }
}
