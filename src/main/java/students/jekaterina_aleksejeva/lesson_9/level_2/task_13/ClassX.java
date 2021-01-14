package students.jekaterina_aleksejeva.lesson_9.level_2.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}

class ClassDemo {
    public static void main(String[] args) {
        ClassY demo = new ClassY(0);
    }
}
