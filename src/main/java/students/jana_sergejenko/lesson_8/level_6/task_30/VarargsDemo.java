package students.jana_sergejenko.lesson_8.level_6.task_30;

public class VarargsDemo {
    public static void main( String[] args ) {
        Varargs vg = new Varargs();
        vg.add_names();
        vg.add_names(" Janis");
        vg.add_names(" Anna", " Liene");
        vg.add_names(" Liza", " Marija", " Andrej", " Inna");
    }
}
