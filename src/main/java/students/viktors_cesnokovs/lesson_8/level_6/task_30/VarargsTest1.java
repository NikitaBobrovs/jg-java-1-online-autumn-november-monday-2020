package students.viktors_cesnokovs.lesson_8.level_6.task_30;

public class VarargsTest1 {
    static void text(String... names) {
        System.out.println("Car brand");
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        text("BMW");
        text("HONDA");
        text("VOLVO");
    }
}
