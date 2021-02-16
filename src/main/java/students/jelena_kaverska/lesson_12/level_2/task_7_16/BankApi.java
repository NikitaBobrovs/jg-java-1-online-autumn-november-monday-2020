package students.jelena_kaverska.lesson_12.level_2.task_7_16;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}