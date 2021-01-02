package students.jelena_kaverska.lesson_8.level_3.task_13;

abstract class Ticket {
    private String id;
    private double price;
    private int baggageItems;

    Ticket(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Economy extends Ticket {

    Economy(String id, double price) {
        super(id, price);
    }

}

class Comfort extends Ticket {

    Comfort(String id, double price) {
        super(id, price);
    }
}

class Business extends Ticket {

    Business(String id, double price) {
        super(id, price);
    }
}