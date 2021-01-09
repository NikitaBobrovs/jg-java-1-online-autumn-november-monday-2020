package students.nikita_bobrovs.lesson_9.level_1.task_5;

class SafeV2Demo {
    public static void main(String[] args) {
        SafeV2 demoSafe = new SafeV2("Password",50.00);

        System.out.println(demoSafe.getMoney("Password",25.50));
        System.out.println(demoSafe.getMoney("pass",50.00));

        System.out.println(demoSafe.putMoney("Password",10.50));
        System.out.println(demoSafe.putMoney("passcode",10));
    }
}
