package instructor.lesson_9;

class PassBy_Primitive {

    // 1. Pass by reference - NEVER
    // 2. Pass by value - ONLY

    public static void main(String[] args) {

        int a = 10;

        foo(a);

        System.out.println("[main] a = " + a);
    }

    public static void foo(int a) {
        System.out.println("[foo] a = " + a);
        a = 20;
    }
}
