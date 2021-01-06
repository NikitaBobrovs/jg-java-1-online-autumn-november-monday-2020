package students.nikita_bobrovs.lesson_8.level_3.task_13;

abstract class InternetServiceProvider {
    private int price;
    private int internetSpeed;

    abstract void offer();

    InternetServiceProvider(int price, int internetSpeed){
        this.internetSpeed = internetSpeed;
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getInternetSpeed() {
        return internetSpeed;
    }

    void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }
}
