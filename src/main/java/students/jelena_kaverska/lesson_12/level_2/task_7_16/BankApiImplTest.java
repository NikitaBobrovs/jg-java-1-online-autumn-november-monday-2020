package students.jelena_kaverska.lesson_12.level_2.task_7_16;

import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    private final BankApi bankApi = new BankApiImpl(List.of(new BankClient("123", "AAA BBBB"),
            new BankClient("987", "QQQ WWW")));

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testFindByUidWithRightRole() throws AccessDeniedException {
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS, Role.OTHER_ROLE));
        Optional<BankClient> exp = Optional.of(new BankClient("123", "AAA BBBB"));
        Optional<BankClient> act = bankApi.findByUid(credentials, "123");
        System.out.println("Test find by uid with valid role: " + printResults(exp.equals(act)));
    }

    void testFindByUidWithRightRole1() throws AccessDeniedException {
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS, Role.OTHER_ROLE));
        Optional<BankClient> exp = Optional.empty();
        Optional<BankClient> act = bankApi.findByUid(credentials, "1234");
        System.out.println("Test find by uid with valid role 1: " + printResults(exp.equals(act)));
    }

    void testFindByUidWithInvalidRole() {
        UserCredentials credentials = new UserCredentials(List.of(Role.OTHER_ROLE));
        System.out.print("Test find by uid with invalid role: ");
        try {
            bankApi.findByUid(credentials, "123");
            System.out.print("FAILED\n");
        } catch (AccessDeniedException e) {
            System.out.print("PASSED\n");
        }
    }

    public static void main(String[] args) throws AccessDeniedException {
        BankApiImplTest tests = new BankApiImplTest();
        tests.testFindByUidWithRightRole();
        tests.testFindByUidWithRightRole1();
        tests.testFindByUidWithInvalidRole();
    }
}