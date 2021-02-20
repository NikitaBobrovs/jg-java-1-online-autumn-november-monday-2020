package students.tatjana_topcilina.lesson_12.level_2.task_7;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws java.nio.file.AccessDeniedException;
}

