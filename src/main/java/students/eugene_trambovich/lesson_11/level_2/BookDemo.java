package students.eugene_trambovich.lesson_11.level_2;

class BookDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book(7L, "Test", "Framework");

        System.out.println(bookDatabase.save(new Book("Eugene", "Nirvana")));
        System.out.println(bookDatabase.save(new Book("John", "Mountains")));
        System.out.println(bookDatabase.save(new Book("Steve", "Sea")));
        System.out.println(bookDatabase.save(new Book("Dave", "Trains")));
        System.out.println(bookDatabase.save(new Book("Eugene", "Breed")));
        System.out.println(bookDatabase.save(new Book("Dave", "Buses")));
        System.out.println(bookDatabase.save(book1));

        System.out.println("Book count is: " + bookDatabase.countAllBooks());
        System.out.println("Book by Id was deleted: " + bookDatabase.delete(2L));
        System.out.println("Book count is: " + bookDatabase.countAllBooks());
        System.out.println("Book as object was deleted: " + bookDatabase.delete(book1));
        System.out.println("Book count is: " + bookDatabase.countAllBooks());
        System.out.println(bookDatabase.deleteByAuthor("Dave"));
        System.out.println("Book count is: " + bookDatabase.countAllBooks());
        bookDatabase.deleteByTitle("Sea");
        System.out.println("Book count is: " + bookDatabase.countAllBooks());
        System.out.println("find By Id: = " + bookDatabase.findById(1L));
        System.out.println("Find by author: " + bookDatabase.findByAuthor("Eugene"));
        System.out.println("Find by title: " + bookDatabase.findByTitle("Nirvana"));
    }
}
