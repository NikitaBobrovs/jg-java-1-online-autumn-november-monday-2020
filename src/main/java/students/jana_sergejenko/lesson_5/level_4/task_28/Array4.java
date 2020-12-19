package students.jana_sergejenko.lesson_5.level_4.task_28;

class Array4 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i <10; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        int minValue = numbers[0];
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }

        }
        System.out.print("min:" + minValue);
    }
}