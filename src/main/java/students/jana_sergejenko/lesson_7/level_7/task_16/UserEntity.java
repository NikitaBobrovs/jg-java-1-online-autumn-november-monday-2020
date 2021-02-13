package students.jana_sergejenko.lesson_7.level_7.task_16;

public class UserEntity {
    public int id;
    private String name;

    UserEntity(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return id + "\t" + name;
    }
}


