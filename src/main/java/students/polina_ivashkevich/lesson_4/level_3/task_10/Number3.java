package students.polina_ivashkevich.lesson_4.level_3.task_10;




import java.util.Scanner;

public class Number3 {

    int maxNumber( int num1, int num2) {
        if ( num1 > num2 ){ return num1; }
        return num2; }
    int maxNumber ( int num1, int num2, int num3 ) {
        return maxNumber (maxNumber(num1, num2), num3);  }
}
















class NumberDemo {
    public static void main(String[] args) {
        java.util.Scanner num = new Scanner(System.in);
        System.out.println("Enter first  numbers: ");
        int num1 = num.nextInt();
        System.out.println("Enter second  numbers: ");
        int num2 = num.nextInt();
        System.out.println("Enter third  numbers: ");
        int num3 = num.nextInt();
        Number3 all = new Number3();
             System.out.println("The biggest number is: "+all.maxNumber(num1,num2,num3));
        }





    }
