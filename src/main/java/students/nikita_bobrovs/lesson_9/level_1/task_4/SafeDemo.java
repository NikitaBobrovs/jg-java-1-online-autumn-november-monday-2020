package students.nikita_bobrovs.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe demo = new Safe();
        System.out.println("Pin = "+demo.pinCode +". Money = "+demo.moneyInSafe);
        demo.pinCode = 1234;
        demo.moneyInSafe = 5678;
        System.out.println("Pin = "+demo.pinCode +" . Money = "+demo.moneyInSafe);
    }
}
