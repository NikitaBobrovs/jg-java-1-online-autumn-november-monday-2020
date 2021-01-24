package students.jekaterina_aleksejeva.lesson_10.level_3.task_6;

@FunctionalInterface //use this mark, because in case of more than one abstract method,compilation will result error
public interface Greeting {
    void greet(); //has only one abstract method
}
