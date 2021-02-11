package students.viktors_cesnokovs.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception {
    Exception exception = new Exception();
    Exception exception1 = new Exception(getLocalizedMessage());
    Exception exception2 = new Exception(getMessage(), getCause());
    Exception exception3 = new Exception(getCause());
    Exception exception4 = new Exception(getMessage());
}
