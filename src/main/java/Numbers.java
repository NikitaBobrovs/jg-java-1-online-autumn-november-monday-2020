public class Numbers {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println ("first number ");
        int firstNumber = scanner.nextInt();

        System.out.print("second number ");
        int secondNumber = scanner.nextInt();

        int sum = (firstNumber + secondNumber);
        int subtraction = (firstNumber - secondNumber);
        int multiplication = (firstNumber * secondNumber);
        int division = (firstNumber / secondNumber);

        System.out.println ("Sum result :" + sum);
        System.out.println ("Subtraction result :" + subtraction);
        System.out.println ("Multiplication result :" + multiplication);
        System.out.println ("Division result :" + division);
    }
}

