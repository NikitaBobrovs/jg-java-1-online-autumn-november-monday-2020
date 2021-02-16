package students.viktors_cesnokovs.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryError {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        while (true) {
            integerList.add(1);
        }
    }
}
