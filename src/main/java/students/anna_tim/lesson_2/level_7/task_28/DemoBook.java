package students.anna_tim.lesson_2.level_7.task_28;

public class DemoBook {

    public static void main(String[] args) {


        Book myBook = new Book();

        myBook.pagesCount = 150;
        System.out.println(myBook.pagesCount);


        String text = "null";
        System.out.println(text);

        System.out.println(myBook.title);

        myBook.title = "Short Java manual";
        System.out.println(myBook.title);


   }


}
