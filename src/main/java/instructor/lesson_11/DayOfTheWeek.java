package instructor.lesson_11;

public enum DayOfTheWeek {

    MONDAY("..."),
    TUESDAY("..."),
    WEDNESDAY("..."),
    THURSDAY("..."),
    FRIDAY("...");

    private String foo;

    DayOfTheWeek(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }
}

class DayOfTheWeek2 {

    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";

    private DayOfTheWeek2() {
    }
}

class EnumDemo {

    public static void main(String[] args) {

        DayOfTheWeek today = DayOfTheWeek.MONDAY;
        String tomorrow = DayOfTheWeek2.MONDAY;

        switch (today) {
            case MONDAY:
                break;
        }
    }
}

