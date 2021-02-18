package students.polina_ivashkevich.lesson_8.level_1.task_1;

    class Product {
        private String name;
        private double price;

        public Product(){
            System.out.println("Default constructor");
        }
    }
    class ProductDemo{
        public static void main(String[] args) {
            Product p = new Product();
        }
    }