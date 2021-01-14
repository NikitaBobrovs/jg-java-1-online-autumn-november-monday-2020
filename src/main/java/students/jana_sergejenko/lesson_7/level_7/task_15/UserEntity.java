package students.jana_sergejenko.lesson_7.level_7.task_15;

public class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalCode;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    } public String getSurname() {
        return surname;
    } public int getPersonalCode() {
        return personalCode;
    }
    public void setId( int newId) {
        id = newId;
    }
    public void setName( String newName) {
        name = newName;
    }
    public void setSurname( String newSurname) {
        surname = newSurname;
    }
    public void setPersonalCode( int newPersonalCode) {
        personalCode = newPersonalCode;
    }

}
