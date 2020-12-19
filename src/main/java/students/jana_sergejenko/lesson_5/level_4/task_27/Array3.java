package students.jana_sergejenko.lesson_5.level_4.task_27;

class Array3 {
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
        int maxValue = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }

        }
        System.out.print("max:" + maxValue);
    }
}

