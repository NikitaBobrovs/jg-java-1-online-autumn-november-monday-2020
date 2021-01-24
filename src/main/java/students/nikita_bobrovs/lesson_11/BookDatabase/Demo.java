package students.nikita_bobrovs.lesson_11.BookDatabase;

class Demo {
    public static void main(String[] args) {
        DatabaseImpl database = new DatabaseImpl();
        Book book1 = new Book("Alpha", "ANN", "1900");
        Book book2 = new Book("Betta", "BAN", "1910");
        Book book3 = new Book("Gamma", "GAN", "1920");
        Book book4 = new Book("Betta", "DAN", "1930");
        Book book5 = new Book("Foxtrot", "RAN", "1900");
        Book book6 = new Book("Betta", "PAN", "1920");

        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        database.save(book6);

        System.out.println(database.bookList.remove(book1));
        database.delete(book6);
        database.delete(book2);

        database.bookList.forEach(book -> System.out.println(book.toString()));
    }
}
