package students.jekaterina_aleksejeva.lesson_8.level_3.task_13;

abstract class Client {

    private int idNumber;
    private String residence;
    private double balance;

    Client(int idNumber, String residence, double balance) {
        this.idNumber = idNumber;
        this.residence = residence;
        this.balance = balance;
    }

}

class LegalEntity extends Client {

    String name;
    int fileNumber;
    String status;

    LegalEntity(int idNumber, String residence, double balance, String name, int fileNumber, String status) {
        super(idNumber, residence, balance);
        this.name = name;
        this.fileNumber = fileNumber;
        this.status = status;
    }

}

class PhysicalPerson extends Client {

    String firstName;
    String lastName;
    String passportNumber;

    PhysicalPerson(int idNumber, String residence, double balance, String firstName, String lastName, String passportNumber) {
        super(idNumber, residence, balance);
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }


}
