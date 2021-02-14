package students.tatjana_topcilina.lesson_3.level2.task9;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your UserName: ");
        String userName = scan.nextLine();
        System.out.println("Hello" + userName + "!");

    }


}
