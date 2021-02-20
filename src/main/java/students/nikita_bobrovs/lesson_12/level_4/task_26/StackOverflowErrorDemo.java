package students.nikita_bobrovs.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {
    void recursionForever(){
        recursionForever();
    }
    public static void main(String[] args) {
        new StackOverflowErrorDemo().recursionForever();
    }
}
