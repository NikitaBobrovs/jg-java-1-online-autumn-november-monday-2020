package students.jekaterina_aleksejeva.lesson_6.level_4.task_18;

class WhileInfiniteLoop {
    public static void main(String[] args) {

        int i = 1;
        while (true) {
            System.out.println(i++);

        }
    }

}

class ForInfiniteLoop {
    public static void main(String[] args) {

        int i = 1;
        for ( ;; ) {
            System.out.println(i++);

        }
    }
}

