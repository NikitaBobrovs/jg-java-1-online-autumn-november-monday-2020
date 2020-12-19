package instructor.lesson_5;

public class ForLoopDemo4 {

    public static void main(String[] args) {

        System.out.println("before loop");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("after loop");

    }
}
