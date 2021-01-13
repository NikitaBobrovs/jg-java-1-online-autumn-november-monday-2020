package students.jelena_kaverska.lesson_10.level_3.task_7;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}

//not a functional interface, as contains 2 unimplemented methods