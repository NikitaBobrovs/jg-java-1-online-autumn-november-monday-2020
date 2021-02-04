package students.jelena_kaverska.lesson_12.level_2.task_7_16;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
    // то метод должен кидать ошибку AccessDeniedException
    // иначе производить поиск клиента с указанным uid
    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}

class My {
    public static void main(String[] args) {
        BankApi bankApi = new BankApiImpl(List.of(new BankClient("123", "AAAQQQ"),
                new BankClient("567", "WWWSSS")));
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        try {
            System.out.println(bankApi.findByUid(credentials, "567"));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        UserCredentials credentials1 = new UserCredentials(List.of(Role.OTHER_ROLE));

        try {
            System.out.println(bankApi.findByUid(credentials1, "123"));
        }
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}