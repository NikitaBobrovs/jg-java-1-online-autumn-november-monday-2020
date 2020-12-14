package instructor.lesson_7.encapsulation;

import instructor.lesson_7.encapsulation.priv.PrivateDemo;
import instructor.lesson_7.encapsulation.pub.PublicDemo;

public class EncapsulationDemo {

    public static void main(String[] args) {

        PublicDemo publicDemo = new PublicDemo();
        publicDemo.foo = "";
        publicDemo.bar();

        PrivateDemo privateDemo = new PrivateDemo();
    }
}
