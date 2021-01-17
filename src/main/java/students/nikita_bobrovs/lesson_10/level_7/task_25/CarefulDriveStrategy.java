package students.nikita_bobrovs.lesson_10.level_7.task_25;

class CarefulDriveStrategy implements DriveStrategy {
    private final String name;

    CarefulDriveStrategy(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
        return name + " is driving carefully.";
    }
}
