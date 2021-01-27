package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;
import students.nikita_bobrovs.lesson_11.BookDatabase.DatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private final Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new DatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(9,new DeleteBookUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new SearchCriteriaUIAction(bookDatabase));
    }

    public void run() {
        System.out.println("Welcome!");
        System.out.print("""
                Main Menu Options :\s
                        0  = Exit
                        1  = Save Book
                        2  = Find By Id
                        3  = Find By Author
                        4  = Find By Title
                        5  = Find Unique Books
                        6  = Find Unique Authors
                        7  = Find Unique Titles
                        8  = Delete By Id
                        9  = Delete Book
                        10 = Delete By Author
                        11 = Delete By Title
                        12 = Search criteria
                        """);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
