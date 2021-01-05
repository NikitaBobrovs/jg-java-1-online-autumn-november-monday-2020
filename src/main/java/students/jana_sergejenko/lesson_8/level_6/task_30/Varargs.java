package students.jana_sergejenko.lesson_8.level_6.task_30;

public class Varargs {
    void add_names(String... names) {
        System.out.print("Leon");
        for (String str : names) {
            System.out.print(str);
        }
        System.out.println(",");
    }
}

