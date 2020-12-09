package students.jelena_kaverska.lesson_6.level_4.task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}