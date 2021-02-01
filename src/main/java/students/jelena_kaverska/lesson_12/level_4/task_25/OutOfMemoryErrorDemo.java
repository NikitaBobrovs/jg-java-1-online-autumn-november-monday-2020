package students.jelena_kaverska.lesson_12.level_4.task_25;

import java.util.ArrayList;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            list.add(1);
        }
    }
}