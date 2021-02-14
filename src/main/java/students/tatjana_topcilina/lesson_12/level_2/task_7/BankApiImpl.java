package students.tatjana_topcilina.lesson_12.level_2.task_7;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi{
    private final List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }


    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if(!credentials.hasRole(Role.CAN_SEARCH_CLIENT)) {
            throw new AccessDeniedException("");
        } else {
            for(BankClient client : clients) {
                if(client.getUid().equals(uid)) {
                    return Optional.of(client);
                }
            }
        }
        return Optional.empty();
    }
}