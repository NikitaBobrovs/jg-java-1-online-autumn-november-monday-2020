package students.nikita_bobrovs.lesson_8.level_3.task_13;

class Vodaphone extends InternetServiceProvider {
    Vodaphone(int price, int internetSpeed) {
        super(price, internetSpeed);
    }

    @Override
    void offer() {
        System.out.println("We offer "+getInternetSpeed()+"Mb/s just for "+getPrice());
    }
}
