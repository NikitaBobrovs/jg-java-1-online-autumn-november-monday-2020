package students.jelena_kaverska.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe s = new Safe();
        System.out.println(s.amount);
        System.out.println(s.pinCode);

        s.amount = 100;
        s.pinCode = "555";
        System.out.println(s.amount);
        System.out.println(s.pinCode);
    }
}