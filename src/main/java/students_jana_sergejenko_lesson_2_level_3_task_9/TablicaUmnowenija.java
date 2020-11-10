package students_jana_sergejenko_lesson_2_level_3_task_9;

import java.util.Scanner;
public class TablicaUmnowenija {
public static void main(String[]args){
    System.out.println("Vvedite celoe cislo");
    Scanner scanner = new Scanner(System.in);
    int result = 0;
    int celoeCislo = scanner.nextInt();
    int[] tablica = new int[11];
    for (int i = 1; i <= 10; i++) {
System.out.println(celoeCislo+" x "+i+" = "+(i*celoeCislo));
    }
}
}

