package students.jelena_kaverska.lesson_8.level_2.task_7;

class Product {
    private String color;
    private double price;

    Product(String color, double price) {
        this.color = color;
        this.price = price;
    }
}

class Table extends Product {
    private double height;
    private double width;

    Table(String color, double price, double height, double width) {
        super(color, price);
        this.height = height;
        this.width = width;
    }
}

class Demo {
    public static void main(String[] args) {
        Table t = new Table("beige", 50, 120, 60);
    }
}