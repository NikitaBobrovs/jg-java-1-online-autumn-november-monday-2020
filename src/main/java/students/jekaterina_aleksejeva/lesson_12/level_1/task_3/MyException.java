package students.jekaterina_aleksejeva.lesson_12.level_1.task_3;

class MyException extends Exception {

}
/* Class cannot extend multiple classes.
On the other hand, if we use "implements" instead of "extends":
class MyException implements Throwable, Exception, RuntimeException{}
and create multiple interfaces: Throwable,Exception, RuntimeException,
these cannot serve as interfaces, but solely as classes,
thus this is not a solution too.

 */

