package instructor.qa;

class MessageDemo {

    public static void main(String[] args) {

        Message m1 = new Message("123", "Lorem", "John Doe");
        Message m2 = new Message("234", "Lorem");

    }
}

class Message {

    public String id;
    private String text;
    private String author;

    public Message(String id, String text, String author) {
        // Message temp = new Message();
        // temp.id = id;
        // temp.text = text;
        // temp.author = author;
        // return temp;
        this.id = id;
        this.text = text;
        this.author = author;
    }

    public Message(String id, String text) {
        this(id, text, "John Doe");
    }

    public Message(String id) {
        this(id, "N/A");
    }
}

class MemoMessage extends Message {

    // public String id;

    public MemoMessage(String id, String text, String author) {
        super(id, text, author);
    }

    public void foo() {
        System.out.println(id);
    }
}
