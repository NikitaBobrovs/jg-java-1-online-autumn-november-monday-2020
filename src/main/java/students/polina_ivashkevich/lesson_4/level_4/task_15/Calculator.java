package students.polina_ivashkevich.lesson_4.level_4.task_15;

import java.util.Scanner;

public class Calculator {
        public int compare (int firstNumber, int secondNumber,int thirdNumber) {
            if ((firstNumber>secondNumber)&&(firstNumber>thirdNumber)) {
                System.out.println("Biggest number is: "+ firstNumber);
                return firstNumber;
            }if ((secondNumber>firstNumber)&&(secondNumber>thirdNumber)){
                System.out.println("Biggest number is: "+secondNumber);
                return secondNumber;
            } if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)){
                System.out.println("Biggest number is: "+thirdNumber);
                return thirdNumber;
        }   if((firstNumber==secondNumber)&&(firstNumber>thirdNumber)){
                System.out.println("All numbers are equal");
                return thirdNumber;



            }

            return thirdNumber;
        }


    }





