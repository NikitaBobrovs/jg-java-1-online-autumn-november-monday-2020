package students.nikita_bobrovs.lesson_9.level_3.task_16;

class SuperClassConstructorInvoker {
    SuperClassConstructorInvoker() {
        super();                        // Call to super(); must be first statement in constructors body
        System.out.println(1);
        System.out.println(2);
    }
}