package instructor.lesson_7.counter;

class CounterDemo {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println(counter.current());

        counter.increment();
        counter.increment();

        System.out.println(counter.current());

        counter.decrement();

        System.out.println(counter.current());

        counter.reset();

        System.out.println(counter.current());
    }
}
