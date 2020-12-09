package students.jana_sergejenko.lesson_5.level_4.task_29;

class Array5 {
    public static void main(String[] args) {
        int n;
        n = ((int) (Math.random() * 10));
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("even:" + numbers[i]);
            }
        }
    }
}
