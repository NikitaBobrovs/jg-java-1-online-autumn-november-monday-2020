package students.jana_sergejenko.lesson_6.level_7.task_32;

class FizzBuzz {
    public String detect(int initialNumber) {
        if (initialNumber % 15 == 0) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }

}
/*Подсказка: а нужно ли свойство класса initialNumber?
Или метод detect можно реализовать без него?*/