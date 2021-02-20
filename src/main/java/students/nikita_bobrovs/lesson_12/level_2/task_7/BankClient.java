package students.nikita_bobrovs.lesson_12.level_2.task_7;

class BankClient {

    private final String uid;
    private final String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}