package students.polina_ivashkevich.lesson_8.level_3.task_13;



public class Cafe {


    public abstract static class CafePersonal {
        public void say() {
            System.out.println("Cafe personal names is: ");
        }

        public abstract void sayName();

    }

    static class Barista extends CafePersonal {
        @Override
        public void say() {
            super.say();

        }

        @Override
        public void sayName() {
            System.out.println("May name is Jack. I am barista");
        }
    }

    static class Manager extends CafePersonal {
        @Override
        public void say() {
            super.say();
        }

        @Override
        public void sayName() {
            System.out.println("My name is Sonja.I am Manager");
        }
    }

    static class Waitress extends CafePersonal {
        @Override
        public void say() {
            super.say();


        }

        @Override
        public void sayName() {
            System.out.println("My name is Tanja.I am Waitress");
        }
    }
}
