package students.nikita_bobrovs.lesson_10.level_7.task_25;

class RecklessDriveStrategy implements DriveStrategy {
    private final String name;

    RecklessDriveStrategy(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
        return name + " is driving recklessly.";
    }
}
