package students.polina_ivashkevich.lesson_9.level_2.task_13;

public class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }

    public ClassX() {

    }
}

class ClassY extends ClassX {
    public ClassY() {
        super();
        System.out.println(2);
    }
}
