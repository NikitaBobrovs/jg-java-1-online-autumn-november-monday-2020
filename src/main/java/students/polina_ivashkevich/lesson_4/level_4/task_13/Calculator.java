package students.polina_ivashkevich.lesson_4.level_4.task_13;

import java.util.Scanner;

public class Calculator {
        int number;
        public boolean isEven(int number) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void main (String[]args){
                java.util.Scanner scanner = new Scanner(System.in);
                System.out.println("Enter  number: ");
                int number = scanner.nextInt();


                Calculator calculator = new Calculator();
                if (number % 2 == 0) {
                    System.out.println("True");
                }
                if (number % 2 != 0) {
                    System.out.println("False");
                }
            }

        }




