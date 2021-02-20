package students.jana_sergejenko.lesson_12.level_3.task_21;

    class TestException extends Exception { }

    class Main {
        public static void main(String args[]) {
            //1. Got the Test Exception
            //   Inside finally block
            try {
                throw new TestException();
            } catch(TestException t) {
                System.out.println("Got the Test Exception");
            } finally {
                System.out.println("Inside finally block ");
            }
        }
    }

