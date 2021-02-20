package students.tatjana_topcilina.lesson_11.level_1.task_3;
import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(0, 3);

        System.out.println(ints.size());
        ints.remove(0);
        System.out.println(!ints.isEmpty());
        System.out.println(ints);

    }
}
