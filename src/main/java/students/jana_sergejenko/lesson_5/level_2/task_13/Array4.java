package students.jana_sergejenko.lesson_5.level_2.task_13;

class Array4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum = sum + numbers[i];

        }
        System.out.print("sum " + sum);
    }
}
