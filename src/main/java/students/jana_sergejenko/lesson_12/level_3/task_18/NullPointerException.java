package students.jana_sergejenko.lesson_12.level_3.task_18;

public class NullPointerException extends Throwable{

        public static void main(String[] args) {

            foo("aaa");
            //podaetsja null i vizivaet Nullpointexception
            foo(null);

        }

        public static void foo(String s) {
            System.out.println(s.toLowerCase());
        }
    }


