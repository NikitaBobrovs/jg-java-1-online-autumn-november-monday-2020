package students.jana_sergejenko.lesson_10.level_3.task_8;

public class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }



    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }
}


