package students.jekaterina_aleksejeva.lesson_12.level_4.task_25;

import java.util.ArrayList;

class OOM_Example {

    public static void main(String[] args) {
        ArrayList<String> neverEnding = new ArrayList<>();

        for (; ; ) {
            neverEnding.add("infinity");
        }
    }
}

