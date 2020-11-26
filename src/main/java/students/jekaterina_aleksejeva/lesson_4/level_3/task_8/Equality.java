package students.jekaterina_aleksejeva.lesson_4.level_3.task_8;

class Equality {
    int number1;
    int number2;
    int number3;

    void ifEqual () {
        if (number1 == number2 && number2 == number3) {
            System.out.println( "All numbers are equal");}
            else if (number1 != number2 && number2 != number3 && number1 != number3) {
                System.out.println("All numbers are different");}
            else {
                System.out.println("Neither all are equal or different");}
}
}



