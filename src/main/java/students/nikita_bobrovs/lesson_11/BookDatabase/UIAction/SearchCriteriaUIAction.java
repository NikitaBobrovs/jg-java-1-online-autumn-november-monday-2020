package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;
import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;
import students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria.SearchCriteriaCreate;

import java.util.Scanner;

class SearchCriteriaUIAction implements UIAction {
    private final BookDatabase database;

    SearchCriteriaUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();
        System.out.println("Enter books title : ");
        String title = scanner.next();
        System.out.println("Enter books year of issue : ");
        String yearOfIssue = scanner.next();

        Book book = new Book(author, title, yearOfIssue);

        System.out.println("""
                Choose search criteria  :\s
                1 = *** AND ***
                2 = *** OR ***
                        """);
        int userChosenCriteria = scanner.nextInt();

        System.out.println("""
                Choose 1st parameter :\s
                1 = Author
                2 = Title
                3 = Year of issue
                """);
        int userChosenParameter1 = scanner.nextInt();

        System.out.println("""
                Choose 2nd parameter :\s
                1 = Author
                2 = Title
                3 = Year of issue
                """);
        int userChosenParameter2 = scanner.nextInt();

        SearchCriteriaCreate searchCriteriaCreated = new SearchCriteriaCreate(
                book,
                userChosenCriteria,
                userChosenParameter1,
                userChosenParameter2);

        System.out.println(searchCriteriaCreated.build());
    }
}
