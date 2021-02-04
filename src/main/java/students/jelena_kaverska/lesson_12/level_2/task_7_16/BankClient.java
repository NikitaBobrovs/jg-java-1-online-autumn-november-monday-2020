package students.jelena_kaverska.lesson_12.level_2.task_7_16;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient client = (BankClient) o;
        return Objects.equals(uid, client.uid) &&
                Objects.equals(fullName, client.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "uid='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}