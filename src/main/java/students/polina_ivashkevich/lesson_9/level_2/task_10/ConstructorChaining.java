package students.polina_ivashkevich.lesson_9.level_2.task_10;

public class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
    ConstructorChaining(int parameterCount) {
        this("private constructor");
        this.parameterCount = parameterCount;
    }

}
