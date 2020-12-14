package instructor.lesson_7.counter;

class Counter {

    private int value;

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void reset() {
        value = 0;
    }

    public int current() {
        return value;
    }
}
