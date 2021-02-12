package students.viktors_cesnokovs.lesson_12.level_2.task_7;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowException();
        test.shouldNotThrowException();
    }

    void shouldThrowException() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
        }
    }

    void shouldNotThrowException() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST OK");
        } catch (AccessDeniedException e) {
            System.out.println("TEST FAIL");
        }
    }
}
