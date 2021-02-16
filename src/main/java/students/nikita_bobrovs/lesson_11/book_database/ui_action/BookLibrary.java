package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.DatabaseImpl;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

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
        menuNumberToActionMap.put(9, new DeleteBookUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new SearchCriteriaUIAction(bookDatabase));
    }

    public void run() {
        System.out.println("Welcome! \n ");
        System.out.print("Main Menu Options : \n" +"\n"+
                        "0  = Exit \n" +
                        "1  = Save Book \n" +
                        "2  = Find By Id \n" +
                        "3  = Find By Author \n" +
                        "4  = Find By Title \n" +
                        "5  = Find Unique Books \n" +
                        "6  = Find Unique Authors \n" +
                        "7  = Find Unique Titles \n" +
                        "8  = Delete By Id \n" +
                        "9  = Delete Book \n" +
                        "10 = Delete By Author \n" +
                        "11 = Delete By Title \n" +
                        "12 = Count all books \n" +
                        "13 = Search criteria\n"+"\n");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            while (!sc.hasNextInt()){
                sc.nextLine();
                System.out.println("Letters not accepted.Please input numbers : ");
            }
            int userSelectedMenuNumber = sc.nextInt();
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
            System.out.println("Entered number does not exist in menu.");
        }
    }

}
