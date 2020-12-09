package students.jelena_kaverska.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
                if (i % 5 != 0) {
                    i++;
                    continue;
                }
            System.out.print(i + " ");
            i++;
        }
    }
}