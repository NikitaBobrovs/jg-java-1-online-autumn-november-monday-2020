package students.jekaterina_aleksejeva.lesson_12.level_2.task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {
        BankApiImplTest test = new BankApiImplTest();
        test.invalidUidValidRole();
        test.validUidValidRole();
        test.shouldThrowExceptionForInvalidRole();

    }

    List<BankClient> clients = new ArrayList<>(List.of(new BankClient("111", "abc"),
            new BankClient("222", "def"),new BankClient("333", "xyz")));
    BankApi bankApi = new BankApiImpl(clients);

    void invalidUidValidRole() throws AccessDeniedException {
        String scenario = "Search results negative for invalid UID, valid role = ";
        List<Role> roles = new ArrayList<>(List.of(Role.CAN_SEARCH_CLIENTS));
        UserCredentials credentials = new UserCredentials(roles);
        Optional<BankClient> expected  = Optional.empty();
        Optional<BankClient> actual = bankApi.findByUid(credentials, "444");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void validUidValidRole() throws AccessDeniedException {
        String scenario = "Search results positive for valid UID, valid role = ";
        List<Role> roles = new ArrayList<>(List.of(Role.CAN_SEARCH_CLIENTS));
        UserCredentials credentials = new UserCredentials(roles);
        Optional<BankClient> expected  = Optional.of(new BankClient("222", "def")); ;
        Optional<BankClient> actual = bankApi.findByUid(credentials, "222");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void shouldThrowExceptionForInvalidRole(){
        String scenario = "Search by user with invalid role throws Access Denied exception = ";
        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            bankApi.findByUid(credentials, "333");
            System.out.println(scenario + "FAILED");
        } catch(AccessDeniedException e) {
            System.out.println(scenario + "PASS");
        }
    }
}
