package students.jekaterina_aleksejeva.lesson_10.level_3.task_7;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
// non-functional interface has 2 abstract methods