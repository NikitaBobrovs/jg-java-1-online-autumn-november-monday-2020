package instructor.lesson_6;

public class StaticDemo {

    public static void main(String[] args) {

        Message message1 = new Message();
        System.out.println("message1.instancesCount = " + Message.instancesCount);

        Message message2 = new Message();
        System.out.println("message2.instancesCount = " + Message.instancesCount);

        Message message3 = new Message();
        System.out.println("message3.instancesCount = " + Message.instancesCount);

    }
}

class Message {

    static int instancesCount = 0;

    public Message() {
        System.out.println("Creating message..");
        instancesCount++;
    }
}
