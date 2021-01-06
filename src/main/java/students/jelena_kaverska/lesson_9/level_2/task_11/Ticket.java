package students.jelena_kaverska.lesson_9.level_2.task_11;

class Ticket {
    private double price;
    private String destination;

    protected Ticket(double price) {
        this.price = price;
    }

    public Ticket(double price, String destination) {
        //использование протектед конструктора в родительском классе
        this(price);
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", destination= " + destination;
    }
}

class AdvancedTicket extends Ticket {
    private boolean refundable;

    public AdvancedTicket(double price, String destination) {
        super(price+price*0.1, destination);
        this.refundable = true;
    }


    public AdvancedTicket(double price) {
        //вызов протектед конструктора из класса потомка
        super(price);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", refundable=" + refundable +
                '}';
    }
}

class TestDemo {
    public static void main(String[] args) {
        Ticket t = new AdvancedTicket(140, "BBB");
        System.out.println(t.toString());
        AdvancedTicket a = new AdvancedTicket(100, "AAA");
        System.out.println(a.toString());

        Ticket t2 = new Ticket(140, "BBB");
        System.out.println(t2.toString());

        AdvancedTicket ad = new AdvancedTicket(200);
        System.out.println(ad.toString());
    }
}