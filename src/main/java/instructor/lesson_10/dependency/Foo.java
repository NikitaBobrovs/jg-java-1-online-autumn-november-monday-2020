package instructor.lesson_10.dependency;

class Foo {

    private final Bar bar; // Dependency

    // Dependency Injection (Constructor Dependency Injection) - Good
    public Foo(Bar bar) { // Bar - Dependency
        this.bar = bar;
    }

    // Dependency Injection (Field Dependency Injection) - Bad
    // public void setBar(Bar bar) {
    //     this.bar = bar;
    // }

    void foo() {
        System.out.println("Foo");

        // Dependency @ Bar
        // Tight coupling - BAD
        // Bar bar = new Bar();

        bar.bar();
    }
}
