package students.jekaterina_aleksejeva.lesson_12.level_2.task_7;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}

