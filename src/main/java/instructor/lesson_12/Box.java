package instructor.lesson_12;

class BoxDemo {

    public static void main(String[] args) {

        Box<String> sBox = new Box<>();
        sBox.setItem("My Text");

        Box<Dog> dBox = new Box<>();

        Box<Integer> iBox = new Box<>();
    }
}

class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
