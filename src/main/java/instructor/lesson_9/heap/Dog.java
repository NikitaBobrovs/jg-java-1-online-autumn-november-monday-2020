package instructor.lesson_9.heap;

class DogDemo {

    public static void main(String[] args) {

        final int a = 5;

        final Dog d1 = new Dog("Fifi", 1);
        final Dog d2 = new Dog("Fafa", 5);
        final Dog d3 = d1;

        final Dog d4 = new Dog(d1.getName(), d1.getAge() + 1);

//        d1.name = "Fefe";

//        d1.setName("Fefe");

        System.out.println("d1.name = " + d1.getName());
        System.out.println("d2.name = " + d2.getName());
        System.out.println("d3.name = " + d3.getName());

/*        System.out.println("Initial State");

        System.out.println("d1.name = " + d1.name);
        System.out.println("d2.name = " + d2.name);

        System.out.println();
        System.out.println("Reassign 1");

//        d1 = new Dog("Fufu");

        System.out.println("d1.name = " + d1.name);
        System.out.println("d2.name = " + d2.name);

        System.out.println();
        System.out.println("Reassign 2");

//        d2 = d1;

        System.out.println("d1.name = " + d1.name);
        System.out.println("d2.name = " + d2.name);

        System.out.println();
        System.out.println("Rename 1");*/

/*        d1.name = "Fefe";

        System.out.println("d1.name = " + d1.name);
        System.out.println("d2.name = " + d2.name);
        System.out.println("d3.name = " + d3.name);*/



        // 1. Fifi Fifi
        // 2. Fafa Fafa
        // 3. Fufu Fufu
        // 4. Fefe Fefe

    }
}

class Dog {

    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
