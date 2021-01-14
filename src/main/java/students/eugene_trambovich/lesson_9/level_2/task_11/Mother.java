package students.eugene_trambovich.lesson_9.level_2.task_11;

class Mother {
    String eyeColor;
    String noseShape;

    protected Mother(String noseShape) {
        this.noseShape = noseShape;
    }

    public Mother(String eyeColor, String noseShape) {
        this(noseShape);
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return noseShape + " - nose shape, eye color - " + eyeColor;

    }

}
