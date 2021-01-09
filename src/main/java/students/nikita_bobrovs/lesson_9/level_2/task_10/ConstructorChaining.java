package students.nikita_bobrovs.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    ConstructorChaining(int parameterCount){
        this("private Constructor");
        this.parameterCount =parameterCount;
    }
}
