package students.jelena_kaverska.lesson_10.level_3.task_6;

class Addition implements Calculation {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class My {
    public static void main(String[] args) {
        Calculation c = new Addition();
        System.out.println(c.calculate(10, 20));
        Calculation c2 = new Multiplication();
        System.out.println(c2.calculate(10, 20));
        System.out.println("------");
        Calculation my = (a, b) -> a / b;
        System.out.println(my.calculate(20, 10));
    }
}