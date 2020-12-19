package instructor.lesson_7.repository;

class BookRepositoryDemo {

    public static void main(String[] args) {

        Book book1 = new Book("12345", "War & Peace", "Leo Tolstoy");
        Book book2 = new Book("23456", "Parry Hotter", "That Lady");

        BookRepository repository = new BookRepository();

        repository.save(book1);
        repository.save(book2);

        System.out.println("repository.find(\"12345\") = " + repository.find("12345").getTitle());
        System.out.println("repository.find(\"23456\") = " + repository.find("23456").getTitle());
        System.out.println("repository.find(\"00000\") = " + repository.find("00000"));
    }
}
