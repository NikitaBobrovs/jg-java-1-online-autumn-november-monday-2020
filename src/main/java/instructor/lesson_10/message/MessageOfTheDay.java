package instructor.lesson_10.message;

public class MessageOfTheDay {

    private final Message[] messages = {
            new Message("Hello World!"),
            new Message("Lorem Ipsum!"),
            new Message("It is snowing today"),
            new Message("I'm out of ideas")
    };

    private final RandomGenerator random;

    public MessageOfTheDay(RandomGenerator random) {
        this.random = random;
    }

    Message get() {
        int idx = random.nextInt(messages.length);
        return messages[idx];
    }
}
