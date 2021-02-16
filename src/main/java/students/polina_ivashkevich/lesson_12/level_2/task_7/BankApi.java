package students.polina_ivashkevich.lesson_12.level_2.task_7;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
