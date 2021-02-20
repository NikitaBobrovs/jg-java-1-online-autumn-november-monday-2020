package students.nikita_bobrovs.lesson_15.level_2.task_9;

class Trader {
    private final String FullName;
    private final String City;

    public Trader(String fullName, String city) {
        FullName = fullName;
        City = city;
    }

    public String getFullName() {
        return FullName;
    }

    public String getCity() {
        return City;
    }
}
