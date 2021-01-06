package students.nikita_bobrovs.lesson_8.level_3.task_13;

class TalkTalk extends InternetServiceProvider {
    TalkTalk(int price, int internetSpeed) {
        super(price, internetSpeed);
    }

    @Override
    void offer() {
        System.out.println("We offer "+getInternetSpeed()+"Mb/s just for "+getPrice());
    }
}
