package students.polina_ivashkevich.lesson_12.level_2.task_7;

public class BankClient {
    private final String fullName;
    private final String uid;

    public BankClient(String fullName, String uid) {
        this.fullName = fullName;
        this.uid = uid;
    }
    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
