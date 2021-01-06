package students.jelena_kaverska.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}

class MyDemo {
    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining("samplename", 5);
    }
}