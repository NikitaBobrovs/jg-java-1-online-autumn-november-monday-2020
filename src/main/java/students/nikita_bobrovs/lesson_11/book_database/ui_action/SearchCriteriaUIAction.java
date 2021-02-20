package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;
import students.nikita_bobrovs.lesson_11.book_database.search_criterias.SearchCriteriaCreate;

import java.util.Scanner;

class SearchCriteriaUIAction implements UIAction {
    private final BookDatabase database;
    private int userChosenCriteria;
    private int userChosenParameter1;
    private int userChosenParameter2;
    private SearchCriteriaCreate searchCriteriaCreated;
    private Book book;

    SearchCriteriaUIAction(BookDatabase database) {
        this.database = database;
    }
    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();
        System.out.println("Enter books title : ");
        String title = scanner.next();
        System.out.println("Enter books year of issue : ");
        String yearOfIssue = scanner.next();

        this.book = new Book(author, title, yearOfIssue);

        while (true) {
            System.out.println("Choose search criteria  : \n" + "1 = *** AND *** \n" + "2 = *** OR ***");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Letters not accepted.Please input numbers : ");
            }
            this.userChosenCriteria = scanner.nextInt();
            if (userChosenCriteria != 1 && userChosenCriteria != 2) {
                System.out.println("Please choose available option ");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Choose 1st parameter :\n" + "1 = Author \n" + "2 = Title \n" + "3 = Year of issue");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Letters not accepted.Please input numbers : ");
            }
            this.userChosenParameter1 = scanner.nextInt();
            if (userChosenParameter1 != 1 && userChosenParameter1 != 2 && userChosenParameter1 != 3) {
                System.out.println("Please choose available option ");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Choose 2st parameter :\n" + "1 = Author \n" + "2 = Title \n" + "3 = Year of issue");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Letters not accepted.Please input numbers : ");
            }
            this.userChosenParameter2 = scanner.nextInt();
            if (userChosenParameter2 != 1 && userChosenParameter2 != 2 && userChosenParameter2 != 3) {
                System.out.println("Please choose available option ");
            } else {
                break;
            }
        }
    }
    private void setSearchCriteriaCreated(){
        
        this.searchCriteriaCreated = new SearchCriteriaCreate(
                this.book,
                this.userChosenCriteria,
                this.userChosenParameter1,
                this.userChosenParameter2);
    }
    
    @Override
    public void execute() {
        getUserInput();
        setSearchCriteriaCreated();

        database.find(searchCriteriaCreated.build())
                .forEach(book1 -> System.out.println(book1.toString()));
    }
}
