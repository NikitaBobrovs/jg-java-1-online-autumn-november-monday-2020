package students.viktors_cesnokovs.lesson_12.level_2.task_7;

class BankClient {
    private final String uid;
    private final String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }
}
