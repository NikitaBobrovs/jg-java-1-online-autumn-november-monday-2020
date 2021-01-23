package students.jana_sergejenko.lesson_10.level_3.task_8;

public interface ProductDatabase {
    Product save(Product product);

    Product findByTitle(String productTitle);
    void printAll();

}

// ne javljaetsja funkcionlajnim interfeisom, potomu 4to funkcionaljnij interface mowet soderwatj toljko odin abstraktnij metod(metod, v kotorom net body)
// a v dannom slu4ae 2 takih metoda