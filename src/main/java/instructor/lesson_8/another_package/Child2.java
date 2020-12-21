package instructor.lesson_8.another_package;

import instructor.lesson_8.Mom;

public class Child2 extends Mom {

    public Child2(String hairColor) {
        super(hairColor);
    }

    public void foo() {
        this.hairColor = "red";
    }
}
