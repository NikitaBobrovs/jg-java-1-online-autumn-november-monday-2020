package students.jekaterina_aleksejeva.lesson_12.level_1.task_5;

class ExceptionDemo {
    public static void main(String[] args) {
        Exception ex1 = new Exception();
        Exception ex2 = new Exception(String.valueOf(0));
        Exception ex3 = new Exception("404 Error");
    }
}
