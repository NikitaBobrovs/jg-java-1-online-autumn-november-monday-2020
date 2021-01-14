package students.jana_sergejenko.lesson_7.level_7.task_15;

public class RunEnc {

    public static void main(String args[]) {
        UserEntity encap = new UserEntity();
        encap.setId(1);
        encap.setName("James");
        encap.setSurname("Black");
        encap.setPersonalCode(1234377272);

        System.out.print("id: "+encap.getId()+ " Name : " + encap.getName() + " Surname : " + encap.getSurname()+" Personal code :"+encap.getPersonalCode());
    }
}