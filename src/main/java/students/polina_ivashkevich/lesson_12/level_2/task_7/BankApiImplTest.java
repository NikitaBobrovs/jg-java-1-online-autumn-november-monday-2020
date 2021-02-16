package students.polina_ivashkevich.lesson_12.level_2.task_7;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class BankApiImplTest {


    public static void main(String[] args) {
        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.shouldNotThrowException();
        bankApiImplTest.shouldThrowException();
    }
    void shouldThrowException() {
        List<BankClient> client = new ArrayList<>();
        BankApi api = (BankApi) new BankApiImplTest();

        List<Role> role = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(role);

        try {
            api.findByUid(credentials, "4325");
            System.out.println("Test fail");
        }
        catch (AccessDeniedException e) {
            System.out.println("Test ok");
        }
    }
    void shouldNotThrowException() {
        List<BankClient> client = new ArrayList<>();
        BankApi api = new BankApiImpl(client);

        List<Role>roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENT);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials,"4325");
            System.out.println("Test ok");
        } catch (AccessDeniedException e) {
            System.out.println("Test Fail");
        }
    }
}
