package students.viktors_cesnokovs.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class ListDataTypes {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);

        List<Bottle> bottles = new ArrayList<>();
        bottles.add(new Bottle());
        bottles.add(new Bottle());
    }
}

class Bottle {
}
