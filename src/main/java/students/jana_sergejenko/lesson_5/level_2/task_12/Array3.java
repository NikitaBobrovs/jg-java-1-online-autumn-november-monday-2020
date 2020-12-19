package students.jana_sergejenko.lesson_5.level_2.task_12;

class Array3 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}