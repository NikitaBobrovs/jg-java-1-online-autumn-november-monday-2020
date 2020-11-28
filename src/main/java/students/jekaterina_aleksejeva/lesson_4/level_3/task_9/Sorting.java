package students.jekaterina_aleksejeva.lesson_4.level_3.task_9;

class Sorting {
    int number1;
    int number2;
    int number3;

    void order () {
        if (number3 >= number2 && number2 >= number1 && number3 > number1) {
            System.out.println( "The numbers are entered in increasing order");}
        else if (number1 >= number2 && number2 >= number3 && number1 > number3) {
            System.out.println("The numbers are entered in decreasing order");}
        else {
            System.out.println("Neither increasing or decreasing order");}
    }
}
