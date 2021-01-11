package instructor.lesson_10.message;

public class MessageOfTheDayTest {

    public static void main(String[] args) {
        MessageOfTheDayTest runner = new MessageOfTheDayTest();
        runner.shouldReturnHelloWorld();
        runner.shouldReturnLoremIpsum();
    }

    void shouldReturnHelloWorld() {
        RandomGenerator randomGenerator = new MockRandomGenerator(0);
        MessageOfTheDay subject = new MessageOfTheDay(randomGenerator);

        Message expected = new Message("Hello World!");
        Message actual = subject.get();

        if (expected.equals(actual)) {
            System.out.println("  [OK]: shouldReturnHelloWorld");
        } else {
            System.out.println("[FAIL]: shouldReturnHelloWorld");
        }
    }

    void shouldReturnLoremIpsum() {
        RandomGenerator randomGenerator = new MockRandomGenerator(1);
        MessageOfTheDay subject = new MessageOfTheDay(randomGenerator);

        Message expected = new Message("Lorem Ipsum!");
        Message actual = subject.get();

        if (expected.equals(actual)) {
            System.out.println("  [OK]: shouldReturnLoremIpsum");
        } else {
            System.out.println("[FAIL]: shouldReturnLoremIpsum");
        }
    }
}
