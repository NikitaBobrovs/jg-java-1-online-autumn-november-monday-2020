package students.jelena_kaverska.lesson_12.level_2.task_7_16;

class AccessDeniedException extends Exception{

    public AccessDeniedException() {
        super("Access denied for this operation");
    }
}