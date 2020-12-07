package instructor.lesson_6;

public class WhiteLoopDemo {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 0) {
            System.out.println(counter);
            counter++;
        }
    }
}
