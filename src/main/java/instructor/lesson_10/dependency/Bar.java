package instructor.lesson_10.dependency;

class Bar {

    private final Baz baz; // Dependency

    // Dependency Injection (Constructor Dependency Injection) - Good
    public Bar(Baz baz) { // Baz - Dependency
        this.baz = baz;
    }

    void bar() {
        System.out.println("Bar");

        // Dependency @ Baz
        // Tight coupling - BAD
        // Baz baz = new Baz();

        baz.baz();
    }
}
