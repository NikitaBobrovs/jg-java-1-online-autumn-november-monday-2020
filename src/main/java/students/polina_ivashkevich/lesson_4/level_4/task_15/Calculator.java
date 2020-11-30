package students.polina_ivashkevich.lesson_4.level_4.task_15;

import java.util.Scanner;

public class Calculator {
        public int compare (int firstNumber, int secondNumber,int thirdNumber) {
            if ((firstNumber>secondNumber)&&(firstNumber>thirdNumber)) {
                return firstNumber;
            }if ((secondNumber>firstNumber)&&(secondNumber>thirdNumber)){
                return secondNumber;
            } if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)){
                return thirdNumber;
        }   if((firstNumber==secondNumber)&&(firstNumber>thirdNumber)){
                return thirdNumber;



            }

            return thirdNumber;
        }

    public static void main(String[] args) {


            java.util.Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter secondNumber number");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter third number");
            int thirdNumber = scanner.nextInt();


            Calculator calculator = new Calculator();
            if ((firstNumber>secondNumber)&&(firstNumber>thirdNumber)) {
                System.out.println("Biggest number is: "+ firstNumber);
            }if ((secondNumber>firstNumber)&&(secondNumber>thirdNumber)) {
                System.out.println("Biggest number is: "+secondNumber);
            } if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)) {
                System.out.println("Biggest number is: "+thirdNumber);
            }if((firstNumber==secondNumber)&&(firstNumber>thirdNumber)){
                System.out.println("Two first numbers are equal but third number is least");
            }if((firstNumber==secondNumber)&&(secondNumber==thirdNumber)){
                System.out.println("All numbers are equal");
            }
        }
    }





