package students.nikita_bobrovs.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        while (true){
            stringList.add(new String());
        }
    }
}
