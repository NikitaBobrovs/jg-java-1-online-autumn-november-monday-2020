package students.jana_sergejenko.lesson_5.level_2.task_15;

class Array6 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] +=2;
            System.out.print(numbers[i] + " ");
        }
    }
}