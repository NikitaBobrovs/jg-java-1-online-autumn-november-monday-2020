package students.jekaterina_aleksejeva.lesson_6.level_4.task_19;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i++);
            break;
        }
    }
}

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        for (; ; ) {
            System.out.println(i++);
            break;
        }
    }
}

