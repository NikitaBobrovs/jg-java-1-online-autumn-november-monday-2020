package students.eugene_trambovich.lesson_12.level_1.task_5;

public class ExceptionDemo extends Exception {

    Exception exception = new Exception();
    Exception exception2 = new Exception(getCause());
    Exception exception3 = new Exception(getMessage());
    Exception exception4 = new Exception("the result is out of boundary values");

}
