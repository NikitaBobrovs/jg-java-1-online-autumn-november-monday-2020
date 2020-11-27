package students.jekaterina_aleksejeva.lesson_4.level_3.task_10;

class Max {
    int number1;
    int number2;
    int number3;

    int max (int number1, int number2) {
        if (number1 > number2) {
            return number1; }
        else {
            return number2; }
    }

    int maximum (int number1, int number2, int number3) {
        return max(max(number1,number2), number3);}

       // if (number1 > number2 && number1 > number3) {
       //    return number1; }
       // else if (number2 > number1 && number2 > number3) {
       // return number2;}
       // else { return number3;}
}


