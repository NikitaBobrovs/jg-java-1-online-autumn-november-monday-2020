package students.jekaterina_aleksejeva.lesson_12.level_3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
/*ArithmeticException is a subclass of RuntimeException and RuntimeException extends Exception.
A subclass must be caught (and placed in front) before its superclass.
Otherwise, we receive a compilation error "exception XxxException has already been caught".
 */