package students.jekaterina_aleksejeva.lesson_6.level_4.task_18;

class WhileInfiniteLoop {
    public static void main(String[] args) {

        int i = 5;
        while (true) {
            System.out.println(i*100);
        }
    }

}

class ForInfiniteLoop {
    public static void main(String[] args) {

        int i = 5;
        for ( ;; ) {
            System.out.println(i*100);
        }
    }
}
