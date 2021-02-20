package students.tatjana_topcilina.lesson_9.level_2.task_12;

public class A {
    A() {
            System.out.println("Class A Constructor");
        }
    }

    class B extends A {
        B() {
            System.out.println("Class B Constructor");
        }
    }

    class C extends B {
        C() {
            System.out.println("Class C Constructor");
        }
    }

    class MainClass {
        public static void main(String[] args) {
           new C();
        }
    }

