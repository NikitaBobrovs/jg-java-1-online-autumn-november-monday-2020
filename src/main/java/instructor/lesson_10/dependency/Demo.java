package instructor.lesson_10.dependency;

public class Demo {
    public static void main(String[] args) {

        // new Foo(new Bar(new Baz())); // Hard to read

        Baz baz = new Baz();
        Bar bar = new Bar(baz);
        Foo foo = new Foo(bar);

        foo.foo();

    }
}
