package students.viktors_cesnokovs.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    ConstructorChaining(int parameterCount) {
        this("constructor name");
        this.parameterCount = parameterCount;
    }
}
