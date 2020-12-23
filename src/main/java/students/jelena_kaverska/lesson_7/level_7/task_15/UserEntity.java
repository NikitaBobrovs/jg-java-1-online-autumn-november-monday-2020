package students.jelena_kaverska.lesson_7.level_7.task_15;

public class UserEntity {
    private String id;
    private String name;
    private String surname;
    private String code;

    public UserEntity(String id, String name, String surname, String code) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}