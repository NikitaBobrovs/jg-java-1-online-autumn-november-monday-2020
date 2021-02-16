package instructor.lesson_14;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> printConsumer = new PrintToConsoleConsumer();
        printConsumer.accept("Hello World");
        printConsumer.accept("How are you today?");

    }
}

class PrintToConsoleConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Consumer: " + s);
    }
}
